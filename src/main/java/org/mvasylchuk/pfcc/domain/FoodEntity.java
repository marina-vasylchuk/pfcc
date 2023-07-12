package org.mvasylchuk.pfcc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mvasylchuk.pfcc.user.UserEntity;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "food")
public class FoodEntity {
    private static final String ID_GENERATOR_NAME = "food_id_gen";
    private static final String ID_SEQ_NAME = "food_id_seq";
    @Id
    @GeneratedValue(generator = ID_GENERATOR_NAME)
    @SequenceGenerator(name = ID_GENERATOR_NAME, sequenceName = ID_SEQ_NAME)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private FoodType type;

    @Column(name = "protein")
    private BigDecimal protein;
    @Column(name = "fat")
    private BigDecimal fat;
    @Column(name = "carbohydrates")
    private BigDecimal carbohydrates;
    @Column(name = "calories")
    private BigDecimal calories;
    @Column(name = "is_hidden")
    private Boolean isHidden;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserEntity owner;

    @Column(name = "description")
    private String description;

    @Column(name = "deleted")
    private Boolean isDeleted;

    @OneToMany(mappedBy = "recipe")
    Set<IngredientEntity> ingredients;
}
