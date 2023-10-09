package org.mvasylchuk.pfcc.domain.controller;

import lombok.RequiredArgsConstructor;
import org.mvasylchuk.pfcc.common.dto.Page;
import org.mvasylchuk.pfcc.domain.dto.FoodDto;
import org.mvasylchuk.pfcc.domain.service.FoodService;
import org.mvasylchuk.pfcc.common.dto.BaseResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food")
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @PostMapping("/")
    @PreAuthorize("isAuthenticated()")
    public BaseResponse<FoodDto> add(@RequestBody FoodDto request) {
        return BaseResponse.success(foodService.addFood(request));
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public BaseResponse<Void> remove(@PathVariable Long id){
        foodService.remove(id);
        return BaseResponse.success(null);
    }
    @GetMapping("/")
    @PreAuthorize("isAuthenticated()")
    public Page<FoodDto> get(@RequestParam(name = "page",required = false, defaultValue = "0") Integer page,
                             @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize){
        return foodService.getFoodList(page,pageSize);
    }
    @GetMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public  BaseResponse<FoodDto> getById(@PathVariable Long id){
        return BaseResponse.success(foodService.getFoodById(id));
    }
}
