package com.hamgar.foodordering.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientCategory {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;
    @JsonIgnore
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL) // un IngredientCategory tiene muchos ingredients o una categoria puede tener muchos ingedientes en su rango
    private List<IngredientItem> ingredients = new ArrayList<>();
}
