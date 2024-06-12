package demo.springboot.hotpot.services;

import demo.springboot.hotpot.constants.HttpErrorConstants;
import demo.springboot.hotpot.entities.DishOrder;
import demo.springboot.hotpot.entities.Order;
import demo.springboot.hotpot.exception.HttpErrorException;
import demo.springboot.hotpot.models.HttpError;
import demo.springboot.hotpot.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import demo.springboot.hotpot.repositories.DishOrderRepository;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import static demo.springboot.hotpot.constants.Status.PENDING;

@Service
@AllArgsConstructor
@Transactional(rollbackOn = { SQLException.class, HttpErrorException.class })
public class DishOrderService {

    private final DishService dishService;
    private static final Logger logger = LoggerFactory.getLogger(DishOrderService.class);
    @Autowired
    private DishOrderRepository repository;

    @Autowired
    private OrderRepository orderRepository;

    public Order create(Long orderId, List<DishOrder> data) throws HttpErrorException {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
        List<DishOrder> list = new ArrayList<>();
        BigDecimal amountTotal = BigDecimal.ZERO;


        for(DishOrder dishOrder : data) {
            Long dishId = dishOrder.getDishId();
            var dataToCreate = DishOrder.builder()
                    .dishId(dishId)
                    .quantity(dishOrder.getQuantity())
                    .orderId(orderId)
                    .status(PENDING)
                    .build();



            BigDecimal dishPrice = dishService.getDishPrice(dishId);
            if(dishPrice == null) {
                throw new HttpErrorException(HttpStatus.UNPROCESSABLE_ENTITY,
                        HttpError.builder().code(HttpErrorConstants.Code._422_INVALID_DATA).build());
            }
           amountTotal = amountTotal.add(dishService.getDishPrice(dishId).multiply(BigDecimal.valueOf(dishOrder.getQuantity())));
            list.add(dataToCreate);

        }
        List<DishOrder> res = repository.saveAll(list);
        order.setDishOrders(res);
        order.setTotalAmount(amountTotal);
        return order;
    }

    public Order update(Long orderId, List<DishOrder> data) throws HttpErrorException {
        repository.deleteAllByOrderId(orderId);
        return this.create(orderId, data);
    }

    public void updateStatus(Long orderId, String status) throws HttpErrorException {
        List<DishOrder> dishOrders = repository.findAllByOrderId(orderId);
        for(DishOrder dishOrder : dishOrders) {
            dishOrder.setStatus(status);
        }
        logger.info("=====> upDate dish status: {}", dishOrders);
        repository.saveAll(dishOrders);
    }









}
