package com.hamgar.foodordering.service;

import com.hamgar.foodordering.model.Category;
import com.hamgar.foodordering.model.Food;
import com.hamgar.foodordering.model.Restaurant;
import com.hamgar.foodordering.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws  Exception;

    public List<Food> getRestaurantsFood(Long restaurantsId,
                                         boolean isVegetarian,
                                         boolean isNonveg,
                                         boolean isSeasonal,
                                         String foodCategory
    );

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws  Exception;

    public Food updateAvailabilityStatus(Long foodId) throws  Exception;
}
