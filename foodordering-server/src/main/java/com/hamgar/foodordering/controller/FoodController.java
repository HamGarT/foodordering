package com.hamgar.foodordering.controller;

import com.hamgar.foodordering.model.Restaurant;
import com.hamgar.foodordering.model.User;
import com.hamgar.foodordering.request.CreateFoodRequest;
import com.hamgar.foodordering.response.MessageResponse;
import com.hamgar.foodordering.service.FoodService;
import com.hamgar.foodordering.service.RestaurantService;
import com.hamgar.foodordering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.hamgar.foodordering.model.Food;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestBody String name,
                                           @RequestHeader("Authorization") String jwt) throws Exception{

        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.searchFood(name);
        return new ResponseEntity<>(foods, HttpStatus.CREATED);

    }

    @PostMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood (
            @RequestParam boolean vegetarian,
            @RequestParam boolean seasonal,
            @RequestParam boolean nonveg,
            @RequestParam(required = false) String food_category,
            @PathVariable Long restaurantId,
            @RequestHeader("Authorization") String jwt) throws Exception{

        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.getRestaurantsFood(restaurantId, vegetarian, nonveg, seasonal, food_category);
        return new ResponseEntity<>(foods, HttpStatus.OK);

    }



}
