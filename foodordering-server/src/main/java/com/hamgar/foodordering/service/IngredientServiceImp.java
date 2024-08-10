package com.hamgar.foodordering.service;

import com.hamgar.foodordering.model.IngredientCategory;
import com.hamgar.foodordering.model.IngredientItem;
import com.hamgar.foodordering.model.Restaurant;
import com.hamgar.foodordering.repository.IngredientCategoryRepository;
import com.hamgar.foodordering.repository.IngredientItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImp implements  IngredientsService{

    @Autowired
    private IngredientItemRepository ingredientItemRepository;

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Autowired
    private RestaurantService restaurantService;

    @Override
    public IngredientCategory createdIngredientCategory(String name, Long restaurantId) throws Exception {
        Restaurant restaurant = restaurantService.findRestaurantById(restaurantId);

        IngredientCategory category = new IngredientCategory();
        category.setRestaurant(restaurant);
        category.setName(name);
        return ingredientCategoryRepository.save(category);
    }

    @Override
    public IngredientCategory findIngredientCategoryById(Long id) throws Exception {

        Optional<IngredientCategory> opt = ingredientCategoryRepository.findById(id);
        if(opt.isEmpty()){
            throw new Exception("ingredient category not fount");
        }
        return opt.get();
    }

    @Override
    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception {
        restaurantService.findRestaurantById(id);
        return ingredientCategoryRepository.findByRestaurantId(id);
    }

    @Override
    public IngredientItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws Exception {
        Restaurant restaurant = restaurantService.findRestaurantById(restaurantId);
        IngredientCategory category = findIngredientCategoryById(categoryId);
        IngredientItem item = new IngredientItem();
        item.setName(ingredientName);
        item.setRestaurant(restaurant);
        item.setCategory(category);

        IngredientItem ingredient = ingredientItemRepository.save(item);
        category.getIngredients().add(ingredient);

        return null;
    }

    @Override
    public List<IngredientItem> findRestaurantsIngredients(Long restaurantId) {
        return ingredientItemRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public IngredientItem updateStock(Long id) throws Exception {
        Optional<IngredientItem> optionalIngredientItem = ingredientItemRepository.findById(id);
        if(optionalIngredientItem.isEmpty()){
            throw  new Exception("ingredient not found");

        }

        IngredientItem ingredientItem = optionalIngredientItem.get();
        ingredientItem.setInStock(!ingredientItem.isInStock());
        return ingredientItemRepository.save(ingredientItem);
    }
}
