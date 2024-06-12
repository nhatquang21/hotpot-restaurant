package demo.springboot.hotpot.repositories;

import demo.springboot.hotpot.entities.DishOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishOrderRepository extends JpaRepository<DishOrder, Long> {
    List<DishOrder> findAllByOrderId(Long orderId);
    void deleteAllByOrderId(Long orderId);
}
