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
import org.mvasylchuk.pfcc.jooq.tables.Ingredients;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IngredientsRecord extends UpdatableRecordImpl<IngredientsRecord> implements Record3<Long, Long, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pfcc.ingredients.recipe_id</code>.
     */
    public void setRecipeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pfcc.ingredients.recipe_id</code>.
     */
    public Long getRecipeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pfcc.ingredients.ingredient_id</code>.
     */
    public void setIngredientId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pfcc.ingredients.ingredient_id</code>.
     */
    public Long getIngredientId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pfcc.ingredients.ingredient_weight</code>.
     */
    public void setIngredientWeight(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>pfcc.ingredients.ingredient_weight</code>.
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
        return Ingredients.INGREDIENTS.RECIPE_ID;
    }

    @Override
    public Field<Long> field2() {
        return Ingredients.INGREDIENTS.INGREDIENT_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Ingredients.INGREDIENTS.INGREDIENT_WEIGHT;
    }

    @Override
    public Long component1() {
        return getRecipeId();
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
        return getRecipeId();
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
    public IngredientsRecord value1(Long value) {
        setRecipeId(value);
        return this;
    }

    @Override
    public IngredientsRecord value2(Long value) {
        setIngredientId(value);
        return this;
    }

    @Override
    public IngredientsRecord value3(BigDecimal value) {
        setIngredientWeight(value);
        return this;
    }

    @Override
    public IngredientsRecord values(Long value1, Long value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IngredientsRecord
     */
    public IngredientsRecord() {
        super(Ingredients.INGREDIENTS);
    }

    /**
     * Create a detached, initialised IngredientsRecord
     */
    public IngredientsRecord(Long recipeId, Long ingredientId, BigDecimal ingredientWeight) {
        super(Ingredients.INGREDIENTS);

        setRecipeId(recipeId);
        setIngredientId(ingredientId);
        setIngredientWeight(ingredientWeight);
        resetChangedOnNotNull();
    }
}
