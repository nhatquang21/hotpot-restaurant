package demo.springboot.hotpot.repositories;

import demo.springboot.hotpot.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
    @Query(value = "select nextval('dish_slug_seq')\\:\\:text", nativeQuery = true)
    String fetchNextDishSlug();
}
