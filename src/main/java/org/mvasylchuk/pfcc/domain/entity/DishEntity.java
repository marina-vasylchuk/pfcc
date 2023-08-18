package org.mvasylchuk.pfcc.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dish")
public class DishEntity {
    private static final String ID_GENERATOR_NAME = "dish_id_gen";
    private static final String ID_SEQ_NAME = "dish_id_seq";
    @Id
    @GeneratedValue(generator = ID_GENERATOR_NAME)
    @SequenceGenerator(name = ID_GENERATOR_NAME, sequenceName = ID_SEQ_NAME)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private FoodEntity food;

    @Column(name = "recipe_weight")
    private BigDecimal recipeWeight;

    @Column(name = "cooked_weight")
    private BigDecimal cookedWeight;

    @Column(name = "protein")
    private BigDecimal protein;
    @Column(name = "fat")
    private BigDecimal fat;
    @Column(name = "carbohydrates")
    private BigDecimal carbohydrates;
    @Column(name = "calories")
    private BigDecimal calories;

    @Column(name = "cooked_on")
    private LocalDateTime cookedOn;

    @Column(name = "deleted")
    private Boolean deleted;


}
