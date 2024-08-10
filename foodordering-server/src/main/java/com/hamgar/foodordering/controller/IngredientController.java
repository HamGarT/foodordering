package com.hamgar.foodordering.controller;

import com.hamgar.foodordering.model.IngredientCategory;
import com.hamgar.foodordering.model.IngredientItem;
import com.hamgar.foodordering.request.IngredientCategoryRequest;
import com.hamgar.foodordering.request.IngredientRequest;
import com.hamgar.foodordering.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import  org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/ingredients")
public class IngredientController {

    @Autowired
    private IngredientsService ingredientsService;

    @PostMapping("/category")
    public ResponseEntity<IngredientCategory> createIngredientCategory(
            @RequestBody IngredientCategoryRequest req
            ) throws Exception{
        IngredientCategory item = ingredientsService.createdIngredientCategory(req.getName(), req.getRestaurantId());
        return new ResponseEntity<>(item, HttpStatus.CREATED);

    }//time 6:12

    @PostMapping()
    public ResponseEntity<IngredientItem> createIngredientItem(
            @RequestBody IngredientRequest req
    ) throws Exception{
        IngredientItem item = ingredientsService.createIngredientItem(req.getRestaurantId(),req.getName(), req.getRestaurantId());
        return new ResponseEntity<>(item, HttpStatus.CREATED);

    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<IngredientItem> updateIngredientStock(
            @PathVariable Long id
    ) throws Exception{
        IngredientItem item = ingredientsService.updateStock(id);
        return new ResponseEntity<>(item, HttpStatus.OK);

    }

    @PutMapping("/restaurant/{id}")
    public ResponseEntity<List<IngredientItem>> getRestaurantIngredient(
            @PathVariable Long id
    ) throws Exception{
        List<IngredientItem> items = ingredientsService.findRestaurantsIngredients(id);
        return new ResponseEntity<>(items, HttpStatus.OK);

    }

    @PutMapping("/restaurant/{id}/category")
    public ResponseEntity<List<IngredientCategory>> getRestaurantIngredientCategory(
            @PathVariable Long id
    ) throws Exception{
        List<IngredientCategory> items = ingredientsService.findIngredientCategoryByRestaurantId(id);
        return new ResponseEntity<>(items, HttpStatus.OK);

    }

}
