package demo.springboot.hotpot.dto;

import demo.springboot.hotpot.entities.Dish;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DishDTO {
    private Long id;
    private String name;
    private String slug;
    private String note;

    public DishDTO(Dish dish) {
        this.id = dish.getId();
        this.name = dish.getName();
        this.slug = dish.getSlug();
        this.note = dish.getNote();
    }
}