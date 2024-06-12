package demo.springboot.hotpot.models;

import demo.springboot.hotpot.entities.DishOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class SaveOrderRQ implements Serializable {

    @NotEmpty
    @Valid
    private List<DishOrder> dishOrders;

}
