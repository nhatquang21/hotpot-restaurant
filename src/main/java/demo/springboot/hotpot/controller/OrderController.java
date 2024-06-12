package demo.springboot.hotpot.controller;


import demo.springboot.hotpot.entities.Dish;
import demo.springboot.hotpot.entities.Order;
import demo.springboot.hotpot.exception.HttpErrorException;
import demo.springboot.hotpot.models.SaveDishRQ;
import demo.springboot.hotpot.models.SaveOrderRQ;
import demo.springboot.hotpot.models.UpdateStatusRQ;
import demo.springboot.hotpot.repositories.DishRepository;
import demo.springboot.hotpot.repositories.OrderRepository;
import demo.springboot.hotpot.services.DishOrderService;
import demo.springboot.hotpot.services.DishService;
import demo.springboot.hotpot.services.OrderService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;
    private final OrderRepository orderRepository;
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // create rest api
    @ApiResponse(responseCode = "201")
    @PostMapping
    ResponseEntity<Order> create(@Valid @RequestBody SaveOrderRQ body) throws HttpErrorException {
        var createOrder = service.create(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(createOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> update(@PathVariable Long id, @RequestBody SaveOrderRQ body) throws HttpErrorException{
        var updatedOrder = service.update(id, body);
        return ResponseEntity.status(HttpStatus.OK).body(updatedOrder);
    }

    @PutMapping("/changeStatus/{id}")
    public ResponseEntity<Boolean> updateStatus(@PathVariable Long id, @RequestBody UpdateStatusRQ body) throws HttpErrorException{
    logger.info("update status for order id:{}" + id + " to status: {} " + body.getStatus());
        var updatedStatus = service.updateStatus(id, body.getStatus());
        return ResponseEntity.status(HttpStatus.OK).body(updatedStatus);
    }

}
