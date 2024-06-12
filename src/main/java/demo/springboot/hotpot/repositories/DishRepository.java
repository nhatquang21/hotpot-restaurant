package demo.springboot.hotpot.repositories;

import demo.springboot.hotpot.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
    @Query(value = "select nextval('dish_slug_seq')\\:\\:text", nativeQuery = true)
    String fetchNextDishSlug();

    @Query(value = "select price_unit from dish where id = :dishId", nativeQuery = true)
    BigDecimal getDishPrice(Long dishId);
}
