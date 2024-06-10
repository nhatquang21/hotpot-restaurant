package demo.springboot.hotpot.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.io.Serializable;
import java.math.BigDecimal;


@Data
public class SaveDishRQ implements Serializable {
    @Size(max = 100)
    @NotBlank
    private String name;

    @Size(max = 255)
    private String note;

    @Valid
    @Positive
    private BigDecimal priceUnit;


}






