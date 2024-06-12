package demo.springboot.hotpot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import demo.springboot.hotpot.mixin.AuditableEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dorder")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order extends AuditableEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "total_amount",nullable = false)
    private BigDecimal totalAmount;


    private String status;


    @OneToMany(mappedBy = "orderId")
    private List<DishOrder> dishOrders;
}
