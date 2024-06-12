package demo.springboot.hotpot.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateStatusRQ {
    @Valid
    @NotBlank
    private String status;
}
