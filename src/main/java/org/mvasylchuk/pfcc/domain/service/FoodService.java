package org.mvasylchuk.pfcc.domain.service;

import lombok.RequiredArgsConstructor;
import org.mvasylchuk.pfcc.domain.dto.FoodDto;
import org.mvasylchuk.pfcc.domain.entity.FoodEntity;
import org.mvasylchuk.pfcc.domain.entity.FoodType;
import org.mvasylchuk.pfcc.domain.entity.IngredientEntity;
import org.mvasylchuk.pfcc.domain.repository.FoodRepository;
import org.mvasylchuk.pfcc.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final UserService userService;
    private final FoodRepository foodRepository;

    public FoodDto addFood(FoodDto request) {
        List<IngredientEntity> ingredientEntities = null;
        if (request.getFoodType() == FoodType.RECIPE) {
            ingredientEntities = request.getIngredients().stream().map(ingredientDto -> {
                IngredientEntity ingredientEntity = new IngredientEntity();

                ingredientEntity.setIngredientWeight(ingredientDto.getIngredientWeight());
                ingredientEntity.setIngredient(foodRepository.getReferenceById(ingredientDto.getId()));

                return ingredientEntity;
            }).toList();
        }

        FoodEntity food = new FoodEntity(null,
                request.getName(),
                request.getFoodType(),
                request.getPfcc(),
                request.getIsHidden(),
                userService.currentUser(),
                request.getDescription(),
                false,
                ingredientEntities);

        foodRepository.save(food);

        return new FoodDto(food.getId(),
                food.getName(),
                food.getDescription(),
                request.getPfcc(),
                request.getIsHidden(),
                food.getType(),
                true,
                request.getIngredients());
    }
}