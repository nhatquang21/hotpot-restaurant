package demo.springboot.hotpot.services;

import demo.springboot.hotpot.constants.HttpErrorConstants;
import demo.springboot.hotpot.entities.DishOrder;
import demo.springboot.hotpot.entities.Order;
import demo.springboot.hotpot.exception.HttpErrorException;
import demo.springboot.hotpot.models.HttpError;
import demo.springboot.hotpot.models.SaveOrderRQ;
import demo.springboot.hotpot.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import demo.springboot.hotpot.constants.Status;
import static demo.springboot.hotpot.constants.Status.PENDING;

@Service
@RequiredArgsConstructor
@Transactional(rollbackOn = {SQLException.class, HttpErrorException.class})
public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
    private final DishOrderService dishOrderService;
    @Autowired
    private OrderRepository repository;

    public Order create(SaveOrderRQ body) throws HttpErrorException {
        List<DishOrder> list = body.getDishOrders();

        Order dataToCreate = Order.builder()
                .status(PENDING)
                .totalAmount(BigDecimal.ZERO)
                .build();

        Order createOrder = repository.save(dataToCreate);
        Order mappingCreateOrder = dishOrderService.create(createOrder.getId(), list);
        return mappingCreateOrder;
    }

    public Order update(Long id, SaveOrderRQ body) throws HttpErrorException {

        List<DishOrder> list = body.getDishOrders();
        Order mappingUpdateOrder = dishOrderService.update(id, list);
        return mappingUpdateOrder;
    }

    public Boolean updateStatus (Long id, String status) throws HttpErrorException {
        Order order = repository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        List<String> validStatuses = Arrays.asList(Status.PENDING, Status.CONFIRMED, Status.CANCELLED, Status.COMPLETED, Status.PAID);
        logger.info("status info hehe: {} {} true/false {}" + status , validStatuses, !validStatuses.contains(status));
        if (!validStatuses.contains(status)) {
            return false;
        }
        order.setStatus(status);
        repository.save(order);
        dishOrderService.updateStatus(id, status);
        return true;
    }
}
