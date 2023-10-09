package org.mvasylchuk.pfcc.domain.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mvasylchuk.pfcc.common.dto.DishRequest;
import org.mvasylchuk.pfcc.common.dto.PfccDto;
import org.mvasylchuk.pfcc.domain.dto.DishDto;
import org.mvasylchuk.pfcc.domain.dto.IngredientDto;
import org.mvasylchuk.pfcc.domain.entity.DishEntity;
import org.mvasylchuk.pfcc.domain.entity.DishIngredientEntity;
import org.mvasylchuk.pfcc.domain.repository.DishIngredientRepository;
import org.mvasylchuk.pfcc.domain.repository.DishRepository;
import org.mvasylchuk.pfcc.domain.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {
    private final DishRepository dishRepository;
    private final FoodRepository foodRepository;
    private final DishIngredientRepository dishIngredientRepository;

    @Transactional(rollbackOn = Exception.class)
    public DishDto addDish(DishRequest request) {
        List<IngredientDto> ingredients = request.getIngredients();

        List<PfccDto> pfccList = ingredients.stream()
                .map(i -> getFullPfcc(i))
                .toList();

        BigDecimal recipeWeight = ingredients.stream()
                .map(IngredientDto::getIngredientWeight)
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0));

        BigDecimal protein = pfccList.stream()
                .map(i -> i.getProtein())
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0))
                .multiply(recipeWeight)
                .divide(request.getCookedWeight()); //todo: divide подсвечивает
        BigDecimal fat = pfccList.stream()
                .map(i -> i.getFat())
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0))
                .multiply(recipeWeight)
                .divide(request.getCookedWeight());
        BigDecimal carbohydrate = pfccList.stream()
                .map(i -> i.getCarbohydrates())
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0))
                .multiply(recipeWeight)
                .divide(request.getCookedWeight());
        BigDecimal calories = pfccList.stream()
                .map(i -> i.getCalories())
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0))
                .multiply(recipeWeight)
                .divide(request.getCookedWeight());

        PfccDto pfcc = new PfccDto(protein, fat, carbohydrate, calories);
        DishEntity dish = new DishEntity();
        dish.setName(request.getName());
        dish.setFood(foodRepository.getReferenceById(request.getFoodId()));
        dish.setRecipeWeight(recipeWeight);
        dish.setCookedWeight(request.getCookedWeight());
        dish.setPfcc(pfcc.toPfcc());
        dish.setCookedOn(request.getCookedOn());
        dish.setIngredients(request.getIngredients().stream()
                .map(i -> {
                    DishIngredientEntity res = new DishIngredientEntity();
                    res.setIngredient(foodRepository.getReferenceById(i.getId()));
                    res.setIngredientWeight(i.getIngredientWeight());
                    res.setDish(dish);
                    return res;
                })
                .toList());
        dish.setDeleted(false);

        dishRepository.save(dish);

        return DishDto.fromDishEntity(dish);
    }

    private PfccDto getFullPfcc(IngredientDto ingredient) {
        PfccDto ingredientPfcc = ingredient.getPfcc();
        BigDecimal multiplier = ingredient.getIngredientWeight().divide(BigDecimal.valueOf(100));
        PfccDto result = new PfccDto(ingredientPfcc.getProtein().multiply(multiplier),
                ingredientPfcc.getFat().multiply(multiplier),
                ingredientPfcc.getCarbohydrates().multiply(multiplier),
                ingredientPfcc.getCalories().multiply(multiplier));
        return result;
    }
}
