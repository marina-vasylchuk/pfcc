/*
 * This file is generated by jOOQ.
 */
package org.mvasylchuk.pfcc.jooq.tables.records;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.mvasylchuk.pfcc.jooq.tables.DishIngredients;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DishIngredientsRecord extends UpdatableRecordImpl<DishIngredientsRecord> implements Record3<Long, Long, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pfcc.dish_ingredients.dish_id</code>.
     */
    public void setDishId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pfcc.dish_ingredients.dish_id</code>.
     */
    public Long getDishId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pfcc.dish_ingredients.ingredient_id</code>.
     */
    public void setIngredientId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pfcc.dish_ingredients.ingredient_id</code>.
     */
    public Long getIngredientId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pfcc.dish_ingredients.ingredient_weight</code>.
     */
    public void setIngredientWeight(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>pfcc.dish_ingredients.ingredient_weight</code>.
     */
    public BigDecimal getIngredientWeight() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return DishIngredients.DISH_INGREDIENTS.DISH_ID;
    }

    @Override
    public Field<Long> field2() {
        return DishIngredients.DISH_INGREDIENTS.INGREDIENT_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return DishIngredients.DISH_INGREDIENTS.INGREDIENT_WEIGHT;
    }

    @Override
    public Long component1() {
        return getDishId();
    }

    @Override
    public Long component2() {
        return getIngredientId();
    }

    @Override
    public BigDecimal component3() {
        return getIngredientWeight();
    }

    @Override
    public Long value1() {
        return getDishId();
    }

    @Override
    public Long value2() {
        return getIngredientId();
    }

    @Override
    public BigDecimal value3() {
        return getIngredientWeight();
    }

    @Override
    public DishIngredientsRecord value1(Long value) {
        setDishId(value);
        return this;
    }

    @Override
    public DishIngredientsRecord value2(Long value) {
        setIngredientId(value);
        return this;
    }

    @Override
    public DishIngredientsRecord value3(BigDecimal value) {
        setIngredientWeight(value);
        return this;
    }

    @Override
    public DishIngredientsRecord values(Long value1, Long value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DishIngredientsRecord
     */
    public DishIngredientsRecord() {
        super(DishIngredients.DISH_INGREDIENTS);
    }

    /**
     * Create a detached, initialised DishIngredientsRecord
     */
    public DishIngredientsRecord(Long dishId, Long ingredientId, BigDecimal ingredientWeight) {
        super(DishIngredients.DISH_INGREDIENTS);

        setDishId(dishId);
        setIngredientId(ingredientId);
        setIngredientWeight(ingredientWeight);
        resetChangedOnNotNull();
    }
}
