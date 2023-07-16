/*
 * This file is generated by jOOQ.
 */
package org.mvasylchuk.pfcc.jooq;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.mvasylchuk.pfcc.jooq.tables.Dish;
import org.mvasylchuk.pfcc.jooq.tables.Food;
import org.mvasylchuk.pfcc.jooq.tables.Ingredients;
import org.mvasylchuk.pfcc.jooq.tables.Meal;
import org.mvasylchuk.pfcc.jooq.tables.Users;
import org.mvasylchuk.pfcc.jooq.tables.records.DishRecord;
import org.mvasylchuk.pfcc.jooq.tables.records.FoodRecord;
import org.mvasylchuk.pfcc.jooq.tables.records.IngredientsRecord;
import org.mvasylchuk.pfcc.jooq.tables.records.MealRecord;
import org.mvasylchuk.pfcc.jooq.tables.records.UsersRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * pfcc.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DishRecord> KEY_DISH_PRIMARY = Internal.createUniqueKey(Dish.DISH, DSL.name("KEY_dish_PRIMARY"), new TableField[] { Dish.DISH.ID }, true);
    public static final UniqueKey<FoodRecord> KEY_FOOD_PRIMARY = Internal.createUniqueKey(Food.FOOD, DSL.name("KEY_food_PRIMARY"), new TableField[] { Food.FOOD.ID }, true);
    public static final UniqueKey<IngredientsRecord> KEY_INGREDIENTS_PRIMARY = Internal.createUniqueKey(Ingredients.INGREDIENTS, DSL.name("KEY_ingredients_PRIMARY"), new TableField[] { Ingredients.INGREDIENTS.RECIPE_ID, Ingredients.INGREDIENTS.INGREDIENT_ID }, true);
    public static final UniqueKey<MealRecord> KEY_MEAL_PRIMARY = Internal.createUniqueKey(Meal.MEAL, DSL.name("KEY_meal_PRIMARY"), new TableField[] { Meal.MEAL.ID }, true);
    public static final UniqueKey<UsersRecord> KEY_USERS_EMAIL = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_email"), new TableField[] { Users.USERS.EMAIL }, true);
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_PRIMARY"), new TableField[] { Users.USERS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<DishRecord, FoodRecord> DISH_IBFK_1 = Internal.createForeignKey(Dish.DISH, DSL.name("dish_ibfk_1"), new TableField[] { Dish.DISH.FOOD_ID }, Keys.KEY_FOOD_PRIMARY, new TableField[] { Food.FOOD.ID }, true);
    public static final ForeignKey<FoodRecord, UsersRecord> FOOD_IBFK_1 = Internal.createForeignKey(Food.FOOD, DSL.name("food_ibfk_1"), new TableField[] { Food.FOOD.OWNER_ID }, Keys.KEY_USERS_PRIMARY, new TableField[] { Users.USERS.ID }, true);
    public static final ForeignKey<IngredientsRecord, FoodRecord> INGREDIENTS_IBFK_1 = Internal.createForeignKey(Ingredients.INGREDIENTS, DSL.name("ingredients_ibfk_1"), new TableField[] { Ingredients.INGREDIENTS.RECIPE_ID }, Keys.KEY_FOOD_PRIMARY, new TableField[] { Food.FOOD.ID }, true);
    public static final ForeignKey<IngredientsRecord, FoodRecord> INGREDIENTS_IBFK_2 = Internal.createForeignKey(Ingredients.INGREDIENTS, DSL.name("ingredients_ibfk_2"), new TableField[] { Ingredients.INGREDIENTS.INGREDIENT_ID }, Keys.KEY_FOOD_PRIMARY, new TableField[] { Food.FOOD.ID }, true);
    public static final ForeignKey<MealRecord, FoodRecord> MEAL_IBFK_1 = Internal.createForeignKey(Meal.MEAL, DSL.name("meal_ibfk_1"), new TableField[] { Meal.MEAL.FOOD_ID }, Keys.KEY_FOOD_PRIMARY, new TableField[] { Food.FOOD.ID }, true);
    public static final ForeignKey<MealRecord, DishRecord> MEAL_IBFK_2 = Internal.createForeignKey(Meal.MEAL, DSL.name("meal_ibfk_2"), new TableField[] { Meal.MEAL.DISH_ID }, Keys.KEY_DISH_PRIMARY, new TableField[] { Dish.DISH.ID }, true);
}
