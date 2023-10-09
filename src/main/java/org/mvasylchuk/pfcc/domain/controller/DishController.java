package org.mvasylchuk.pfcc.domain.controller;

import lombok.RequiredArgsConstructor;
import org.mvasylchuk.pfcc.common.dto.BaseResponse;
import org.mvasylchuk.pfcc.common.dto.DishRequest;
import org.mvasylchuk.pfcc.domain.dto.DishDto;
import org.mvasylchuk.pfcc.domain.service.DishService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dish")
@RequiredArgsConstructor
public class DishController {
    private final DishService dishService;


    @PostMapping("/add")
    @PreAuthorize("isAuthenticated()")
    public BaseResponse<DishDto> add(@RequestBody DishRequest request){
        return BaseResponse.success(dishService.addDish(request));
    }
}
