/*
 * This file is generated by jOOQ.
 */
package org.mvasylchuk.pfcc.jooq.tables.records;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.mvasylchuk.pfcc.jooq.tables.Measurement;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeasurementRecord extends UpdatableRecordImpl<MeasurementRecord> implements Record5<Long, Long, BigDecimal, String, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pfcc.measurement.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pfcc.measurement.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pfcc.measurement.food_id</code>.
     */
    public void setFoodId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pfcc.measurement.food_id</code>.
     */
    public Long getFoodId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pfcc.measurement.to_gram_multiplier</code>.
     */
    public void setToGramMultiplier(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>pfcc.measurement.to_gram_multiplier</code>.
     */
    public BigDecimal getToGramMultiplier() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>pfcc.measurement.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pfcc.measurement.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pfcc.measurement.default_value</code>.
     */
    public void setDefaultValue(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>pfcc.measurement.default_value</code>.
     */
    public BigDecimal getDefaultValue() {
        return (BigDecimal) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, BigDecimal, String, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, BigDecimal, String, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Measurement.MEASUREMENT.ID;
    }

    @Override
    public Field<Long> field2() {
        return Measurement.MEASUREMENT.FOOD_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Measurement.MEASUREMENT.TO_GRAM_MULTIPLIER;
    }

    @Override
    public Field<String> field4() {
        return Measurement.MEASUREMENT.NAME;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Measurement.MEASUREMENT.DEFAULT_VALUE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getFoodId();
    }

    @Override
    public BigDecimal component3() {
        return getToGramMultiplier();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public BigDecimal component5() {
        return getDefaultValue();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getFoodId();
    }

    @Override
    public BigDecimal value3() {
        return getToGramMultiplier();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public BigDecimal value5() {
        return getDefaultValue();
    }

    @Override
    public MeasurementRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MeasurementRecord value2(Long value) {
        setFoodId(value);
        return this;
    }

    @Override
    public MeasurementRecord value3(BigDecimal value) {
        setToGramMultiplier(value);
        return this;
    }

    @Override
    public MeasurementRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public MeasurementRecord value5(BigDecimal value) {
        setDefaultValue(value);
        return this;
    }

    @Override
    public MeasurementRecord values(Long value1, Long value2, BigDecimal value3, String value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MeasurementRecord
     */
    public MeasurementRecord() {
        super(Measurement.MEASUREMENT);
    }

    /**
     * Create a detached, initialised MeasurementRecord
     */
    public MeasurementRecord(Long id, Long foodId, BigDecimal toGramMultiplier, String name, BigDecimal defaultValue) {
        super(Measurement.MEASUREMENT);

        setId(id);
        setFoodId(foodId);
        setToGramMultiplier(toGramMultiplier);
        setName(name);
        setDefaultValue(defaultValue);
        resetChangedOnNotNull();
    }
}
