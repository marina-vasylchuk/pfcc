package org.mvasylchuk.pfcc.domain.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mvasylchuk.pfcc.common.dto.PfccDto;
import org.mvasylchuk.pfcc.common.jpa.Pfcc;
import org.mvasylchuk.pfcc.domain.dto.DishDto;
import org.mvasylchuk.pfcc.domain.dto.IngredientDto;
import org.mvasylchuk.pfcc.domain.entity.DishEntity;
import org.mvasylchuk.pfcc.domain.entity.DishIngredientEntity;
import org.mvasylchuk.pfcc.domain.entity.DishIngredientPrimaryKey;
import org.mvasylchuk.pfcc.domain.entity.FoodEntity;
import org.mvasylchuk.pfcc.domain.repository.FoodRepository;
import org.mvasylchuk.pfcc.user.UserEntity;
import org.mvasylchuk.pfcc.user.UserService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class DishMappingService {
    private final FoodRepository foodRepository;
    private final UserService userService;
    private final PfccMappingService pfccMappingService;

    @Transactional(rollbackOn = Exception.class)
    public DishEntity toEntity(DishDto dishDto) {

        BigDecimal coefByCookedWeight = BigDecimal.valueOf(100).divide(dishDto.getCookedWeight(), RoundingMode.HALF_UP);

        List<IngredientDto> ingredients = dishDto.getIngredients();

        List<Pfcc> pfccList = ingredients.stream()
                .map(this::getFullPfcc)
                .map(pfccMappingService::toPfcc)
                .toList();

        Pfcc completePfcc = Pfcc.combine(pfccList).multiply(coefByCookedWeight);

        BigDecimal recipeWeight = ingredients.stream()
                .map(IngredientDto::getIngredientWeight)
                .reduce(BigDecimal::add).orElse(BigDecimal.valueOf(0));
        DishEntity result = new DishEntity();

        List<DishIngredientEntity> ingredientEntities = new ArrayList<>();

        result.setId(dishDto.getId());
        result.setName(dishDto.getName());
        result.setFood(foodRepository.findById(dishDto.getFoodId()).orElseThrow());
        result.setRecipeWeight(recipeWeight);
        result.setCookedWeight(dishDto.getCookedWeight());
        result.setPfcc(completePfcc);
        result.setCookedOn(dishDto.getCookedOn());
        result.setDeleted(dishDto.getDeleted());
        result.setOwner(userService.currentUser());
        result.setIngredients(dishDto.getIngredients()
                .stream()
                .map(dto -> {
                    DishIngredientEntity entity = new DishIngredientEntity();
                    entity.setId(new DishIngredientPrimaryKey(dishDto.getId(), dto.getId()));
                    entity.setIngredientWeight(dto.getIngredientWeight());
                    entity.setDish(result);
                    entity.setIngredient(foodRepository.findById(dto.getId()).orElseThrow());
                    return entity;
                })
                .toList());

        return result;
    }

    private PfccDto getFullPfcc(IngredientDto ingredient) {
        PfccDto ingredientPfcc = ingredient.getPfcc();
        BigDecimal multiplier = ingredient.getIngredientWeight().divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        return new PfccDto(ingredientPfcc.getProtein().multiply(multiplier),
                ingredientPfcc.getFat().multiply(multiplier),
                ingredientPfcc.getCarbohydrates().multiply(multiplier),
                ingredientPfcc.getCalories().multiply(multiplier));
    }

    @Transactional(rollbackOn = Exception.class)
    public DishDto toDto(DishEntity dishEntity) {
        return new DishDto(dishEntity.getId(),
                dishEntity.getCookedOn(),
                pfccMappingService.toPfccDto(dishEntity.getPfcc()),
                dishEntity.getName(),
                dishEntity.getFood().getId(),
                dishEntity.getIngredients().stream()
                        .map(i -> {
                            UserEntity user = userService.currentUser();
                            FoodEntity ing = i.getIngredient();
                            Boolean ownedByUser = user != null &&
                                    ing.getOwner() != null &&
                                    Objects.equals(user.getId(), ing.getOwner().getId());

                            return new IngredientDto(ing.getId(),
                                    ing.getName(),
                                    ing.getDescription(),
                                    pfccMappingService.toPfccDto(ing.getPfcc()),
                                    ing.getIsHidden(),
                                    ing.getType(),
                                    ownedByUser,
                                    null,
                                    i.getIngredientWeight());
                        })
                        .toList(),
                dishEntity.getRecipeWeight(),
                dishEntity.getCookedWeight(),
                dishEntity.getDeleted());

    }
}
