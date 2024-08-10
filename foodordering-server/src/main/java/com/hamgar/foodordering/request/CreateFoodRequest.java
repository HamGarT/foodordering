package com.hamgar.foodordering.request;

import com.hamgar.foodordering.model.Category;
import com.hamgar.foodordering.model.IngredientItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name ;
    private String description;
    private Long price;
    private Category category;
    private List<String> images;
    private Long restaurantId;
    private boolean vegetarian;
    private boolean seasional;
    private List<IngredientItem> ingredients;
}
