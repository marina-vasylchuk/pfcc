package org.mvasylchuk.pfcc.domain.repository;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.mvasylchuk.pfcc.common.dto.Page;
import org.mvasylchuk.pfcc.common.dto.PfccDto;
import org.mvasylchuk.pfcc.domain.dto.FoodDto;
import org.mvasylchuk.pfcc.domain.entity.FoodType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

import static org.mvasylchuk.pfcc.jooq.tables.Food.FOOD;

@Component
@RequiredArgsConstructor
public class FoodJooqRepository {
    private final DSLContext ctx;

    public Page<FoodDto> getFoodList(Integer page, Integer size, Long userId) {
        Page<FoodDto> foodList = new Page<>();
        Integer totalElements = ctx.fetchCount(FOOD, FOOD.OWNER_ID.equal(userId).or(FOOD.IS_HIDDEN.isFalse()));
        foodList.setPage(page);
        foodList.setPageSize(size);
        foodList.setTotalPages((totalElements / size) + (totalElements % size > 0 ? 1 : 0));
        foodList.setTotalElements(totalElements);

        List<FoodDto> foods = ctx.selectFrom(FOOD)
                .where(FOOD.OWNER_ID.equal(userId))
                .or(FOOD.IS_HIDDEN.isFalse())
                .limit(DSL.inline(size))
                .offset(DSL.inline(size * page))

                .fetch(dbFood -> {
                    FoodDto food = new FoodDto();
                    food.setId(dbFood.get(FOOD.ID));
                    food.setName(dbFood.get(FOOD.NAME));
                    food.setFoodType(FoodType.valueOf(dbFood.get(FOOD.TYPE)));
                    food.setPfcc(new PfccDto(dbFood.get(FOOD.PROTEIN), dbFood.get(FOOD.FAT), dbFood.get(FOOD.CARBOHYDRATES), dbFood.get(FOOD.CALORIES)));
                    food.setDescription(dbFood.get(FOOD.DESCRIPTION));
                    food.setIsHidden(dbFood.get(FOOD.IS_HIDDEN, Boolean.class));
                    food.setOwnedByUser(Objects.equals(dbFood.get(FOOD.OWNER_ID), userId));

                    return food;
                });

        foodList.setData(foods);

        return foodList;
    }

    public FoodDto getFoodById(Long id, Long userId) {

        return ctx.selectFrom(FOOD)
                .where(FOOD.ID.equal(id)
                        .and(FOOD.OWNER_ID.equal(userId)
                                .or(FOOD.IS_HIDDEN.isFalse())))
                .fetchOne(dbFood -> {
                    FoodDto food = new FoodDto();
                    food.setId(dbFood.get(FOOD.ID));
                    food.setName(dbFood.get(FOOD.NAME));
                    food.setFoodType(FoodType.valueOf(dbFood.get(FOOD.TYPE)));
                    food.setPfcc(new PfccDto(dbFood.get(FOOD.PROTEIN), dbFood.get(FOOD.FAT), dbFood.get(FOOD.CARBOHYDRATES), dbFood.get(FOOD.CALORIES)));
                    food.setDescription(dbFood.get(FOOD.DESCRIPTION));
                    food.setIsHidden(dbFood.get(FOOD.IS_HIDDEN, Boolean.class));
                    food.setOwnedByUser(Objects.equals(dbFood.get(FOOD.OWNER_ID), userId));

                    return food;
                });
    }
}