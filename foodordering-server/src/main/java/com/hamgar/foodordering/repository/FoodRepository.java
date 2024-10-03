package com.hamgar.foodordering.repository;

import com.hamgar.foodordering.model.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Long> {

    List<Food> findByRestaurantId(Long restaurantId);

    @Query("SELECT f FROM Food f WHERE f.name LIKE %:keyword% OR f.foodCategory.name LIKE %:keyword%") //4:55:16
    List<Food> searchFood(@Param("keyword") String Keyword);

    @Query(value = "SELECT * FROM food LIMIT %:limit%", nativeQuery = true)
    List<Food> findLimitedFoods(@Param("limit") int limit);
    /*@Query("SELECT f FROM Food f")
    Page<Food> findLimitedFoods(Pageable pageable);*/
}
