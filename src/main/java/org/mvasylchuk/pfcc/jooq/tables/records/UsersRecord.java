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
import org.mvasylchuk.pfcc.jooq.tables.Users;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record11<Long, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, Byte, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pfcc.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pfcc.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pfcc.users.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pfcc.users.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pfcc.users.preferred_language</code>.
     */
    public void setPreferredLanguage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pfcc.users.preferred_language</code>.
     */
    public String getPreferredLanguage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pfcc.users.protein_aim</code>.
     */
    public void setProteinAim(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>pfcc.users.protein_aim</code>.
     */
    public BigDecimal getProteinAim() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>pfcc.users.fat_aim</code>.
     */
    public void setFatAim(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>pfcc.users.fat_aim</code>.
     */
    public BigDecimal getFatAim() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>pfcc.users.carbohydrates_aim</code>.
     */
    public void setCarbohydratesAim(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>pfcc.users.carbohydrates_aim</code>.
     */
    public BigDecimal getCarbohydratesAim() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>pfcc.users.calories_aim</code>.
     */
    public void setCaloriesAim(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pfcc.users.calories_aim</code>.
     */
    public BigDecimal getCaloriesAim() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pfcc.users.profile_configured</code>.
     */
    public void setProfileConfigured(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>pfcc.users.profile_configured</code>.
     */
    public Byte getProfileConfigured() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>pfcc.users.email_confirmed</code>.
     */
    public void setEmailConfirmed(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>pfcc.users.email_confirmed</code>.
     */
    public Byte getEmailConfirmed() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>pfcc.users.password</code>.
     */
    public void setPassword(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pfcc.users.password</code>.
     */
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pfcc.users.roles</code>.
     */
    public void setRoles(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pfcc.users.roles</code>.
     */
    public String getRoles() {
        return (String) get(10);
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
    public Row11<Long, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, Byte, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, Byte, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.EMAIL;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.PREFERRED_LANGUAGE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Users.USERS.PROTEIN_AIM;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Users.USERS.FAT_AIM;
    }

    @Override
    public Field<BigDecimal> field6() {
        return Users.USERS.CARBOHYDRATES_AIM;
    }

    @Override
    public Field<BigDecimal> field7() {
        return Users.USERS.CALORIES_AIM;
    }

    @Override
    public Field<Byte> field8() {
        return Users.USERS.PROFILE_CONFIGURED;
    }

    @Override
    public Field<Byte> field9() {
        return Users.USERS.EMAIL_CONFIRMED;
    }

    @Override
    public Field<String> field10() {
        return Users.USERS.PASSWORD;
    }

    @Override
    public Field<String> field11() {
        return Users.USERS.ROLES;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEmail();
    }

    @Override
    public String component3() {
        return getPreferredLanguage();
    }

    @Override
    public BigDecimal component4() {
        return getProteinAim();
    }

    @Override
    public BigDecimal component5() {
        return getFatAim();
    }

    @Override
    public BigDecimal component6() {
        return getCarbohydratesAim();
    }

    @Override
    public BigDecimal component7() {
        return getCaloriesAim();
    }

    @Override
    public Byte component8() {
        return getProfileConfigured();
    }

    @Override
    public Byte component9() {
        return getEmailConfirmed();
    }

    @Override
    public String component10() {
        return getPassword();
    }

    @Override
    public String component11() {
        return getRoles();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEmail();
    }

    @Override
    public String value3() {
        return getPreferredLanguage();
    }

    @Override
    public BigDecimal value4() {
        return getProteinAim();
    }

    @Override
    public BigDecimal value5() {
        return getFatAim();
    }

    @Override
    public BigDecimal value6() {
        return getCarbohydratesAim();
    }

    @Override
    public BigDecimal value7() {
        return getCaloriesAim();
    }

    @Override
    public Byte value8() {
        return getProfileConfigured();
    }

    @Override
    public Byte value9() {
        return getEmailConfirmed();
    }

    @Override
    public String value10() {
        return getPassword();
    }

    @Override
    public String value11() {
        return getRoles();
    }

    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setPreferredLanguage(value);
        return this;
    }

    @Override
    public UsersRecord value4(BigDecimal value) {
        setProteinAim(value);
        return this;
    }

    @Override
    public UsersRecord value5(BigDecimal value) {
        setFatAim(value);
        return this;
    }

    @Override
    public UsersRecord value6(BigDecimal value) {
        setCarbohydratesAim(value);
        return this;
    }

    @Override
    public UsersRecord value7(BigDecimal value) {
        setCaloriesAim(value);
        return this;
    }

    @Override
    public UsersRecord value8(Byte value) {
        setProfileConfigured(value);
        return this;
    }

    @Override
    public UsersRecord value9(Byte value) {
        setEmailConfirmed(value);
        return this;
    }

    @Override
    public UsersRecord value10(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UsersRecord value11(String value) {
        setRoles(value);
        return this;
    }

    @Override
    public UsersRecord values(Long value1, String value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, Byte value8, Byte value9, String value10, String value11) {
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
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, String email, String preferredLanguage, BigDecimal proteinAim, BigDecimal fatAim, BigDecimal carbohydratesAim, BigDecimal caloriesAim, Byte profileConfigured, Byte emailConfirmed, String password, String roles) {
        super(Users.USERS);

        setId(id);
        setEmail(email);
        setPreferredLanguage(preferredLanguage);
        setProteinAim(proteinAim);
        setFatAim(fatAim);
        setCarbohydratesAim(carbohydratesAim);
        setCaloriesAim(caloriesAim);
        setProfileConfigured(profileConfigured);
        setEmailConfirmed(emailConfirmed);
        setPassword(password);
        setRoles(roles);
        resetChangedOnNotNull();
    }
}
