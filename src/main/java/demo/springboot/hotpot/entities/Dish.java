package demo.springboot.hotpot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import demo.springboot.hotpot.mixin.AuditableEntity;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dish", indexes = @Index(name = "dish_slug_uniq", columnList = "slug", unique = true))
public class Dish extends AuditableEntity<Long>  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String slug;


    @Column
    private String note;

    @NotBlank
    @Column(name = "price_unit", nullable = false)
    @Positive
    private BigDecimal priceUnit;

}
