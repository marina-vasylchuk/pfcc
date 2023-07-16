/*
 * This file is generated by jOOQ.
 */
package org.mvasylchuk.pfcc.jooq.tables.records;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.mvasylchuk.pfcc.jooq.tables.Food;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoodRecord extends UpdatableRecordImpl<FoodRecord> implements Record11<Long, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, Long, String, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pfcc.food.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pfcc.food.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pfcc.food.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pfcc.food.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pfcc.food.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pfcc.food.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pfcc.food.protein</code>.
     */
    public void setProtein(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>pfcc.food.protein</code>.
     */
    public BigDecimal getProtein() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>pfcc.food.fat</code>.
     */
    public void setFat(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>pfcc.food.fat</code>.
     */
    public BigDecimal getFat() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>pfcc.food.carbohydrates</code>.
     */
    public void setCarbohydrates(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>pfcc.food.carbohydrates</code>.
     */
    public BigDecimal getCarbohydrates() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>pfcc.food.calories</code>.
     */
    public void setCalories(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pfcc.food.calories</code>.
     */
    public BigDecimal getCalories() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pfcc.food.is_hidden</code>.
     */
    public void setIsHidden(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>pfcc.food.is_hidden</code>.
     */
    public Byte getIsHidden() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>pfcc.food.owner_id</code>.
     */
    public void setOwnerId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pfcc.food.owner_id</code>.
     */
    public Long getOwnerId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pfcc.food.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pfcc.food.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pfcc.food.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>pfcc.food.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, Long, String, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, Long, String, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Food.FOOD.ID;
    }

    @Override
    public Field<String> field2() {
        return Food.FOOD.NAME;
    }

    @Override
    public Field<String> field3() {
        return Food.FOOD.TYPE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Food.FOOD.PROTEIN;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Food.FOOD.FAT;
    }

    @Override
    public Field<BigDecimal> field6() {
        return Food.FOOD.CARBOHYDRATES;
    }

    @Override
    public Field<BigDecimal> field7() {
        return Food.FOOD.CALORIES;
    }

    @Override
    public Field<Byte> field8() {
        return Food.FOOD.IS_HIDDEN;
    }

    @Override
    public Field<Long> field9() {
        return Food.FOOD.OWNER_ID;
    }

    @Override
    public Field<String> field10() {
        return Food.FOOD.DESCRIPTION;
    }

    @Override
    public Field<Byte> field11() {
        return Food.FOOD.DELETED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public BigDecimal component4() {
        return getProtein();
    }

    @Override
    public BigDecimal component5() {
        return getFat();
    }

    @Override
    public BigDecimal component6() {
        return getCarbohydrates();
    }

    @Override
    public BigDecimal component7() {
        return getCalories();
    }

    @Override
    public Byte component8() {
        return getIsHidden();
    }

    @Override
    public Long component9() {
        return getOwnerId();
    }

    @Override
    public String component10() {
        return getDescription();
    }

    @Override
    public Byte component11() {
        return getDeleted();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public BigDecimal value4() {
        return getProtein();
    }

    @Override
    public BigDecimal value5() {
        return getFat();
    }

    @Override
    public BigDecimal value6() {
        return getCarbohydrates();
    }

    @Override
    public BigDecimal value7() {
        return getCalories();
    }

    @Override
    public Byte value8() {
        return getIsHidden();
    }

    @Override
    public Long value9() {
        return getOwnerId();
    }

    @Override
    public String value10() {
        return getDescription();
    }

    @Override
    public Byte value11() {
        return getDeleted();
    }

    @Override
    public FoodRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FoodRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FoodRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public FoodRecord value4(BigDecimal value) {
        setProtein(value);
        return this;
    }

    @Override
    public FoodRecord value5(BigDecimal value) {
        setFat(value);
        return this;
    }

    @Override
    public FoodRecord value6(BigDecimal value) {
        setCarbohydrates(value);
        return this;
    }

    @Override
    public FoodRecord value7(BigDecimal value) {
        setCalories(value);
        return this;
    }

    @Override
    public FoodRecord value8(Byte value) {
        setIsHidden(value);
        return this;
    }

    @Override
    public FoodRecord value9(Long value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public FoodRecord value10(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FoodRecord value11(Byte value) {
        setDeleted(value);
        return this;
    }

    @Override
    public FoodRecord values(Long value1, String value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, Byte value8, Long value9, String value10, Byte value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FoodRecord
     */
    public FoodRecord() {
        super(Food.FOOD);
    }

    /**
     * Create a detached, initialised FoodRecord
     */
    public FoodRecord(Long id, String name, String type, BigDecimal protein, BigDecimal fat, BigDecimal carbohydrates, BigDecimal calories, Byte isHidden, Long ownerId, String description, Byte deleted) {
        super(Food.FOOD);

        setId(id);
        setName(name);
        setType(type);
        setProtein(protein);
        setFat(fat);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
        setIsHidden(isHidden);
        setOwnerId(ownerId);
        setDescription(description);
        setDeleted(deleted);
        resetChangedOnNotNull();
    }
}
