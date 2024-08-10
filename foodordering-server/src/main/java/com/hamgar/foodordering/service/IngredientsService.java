package com.hamgar.foodordering.service;

import com.hamgar.foodordering.model.IngredientCategory;
import com.hamgar.foodordering.model.IngredientItem;

import java.util.List;

public interface IngredientsService {

    public IngredientCategory createdIngredientCategory(String name, Long restaurantId) throws Exception;

    public IngredientCategory findIngredientCategoryById(Long id) throws  Exception;

    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception;

    public IngredientItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws  Exception;

    public List<IngredientItem> findRestaurantsIngredients(Long restaurantId);

    public IngredientItem updateStock(Long id) throws Exception;



}
