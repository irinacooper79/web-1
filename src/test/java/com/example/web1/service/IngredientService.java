package com.example.web1.service;

import me.recipe.bookrecipes.model.Ingredient;
import me.recipe.bookrecipes.servic.IngredientService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final Map<Integer, com.example.web1.service.Ingredient> ingredients = new HashMap<>();
        private int id = 0;

    public Collection<com.example.web1.service.IngredientService> getAllIngredient() {// получение всех ингред
        return IngredientService.values();
    }

    public com.example.web1.service.Ingredient addIngredient(com.example.web1.service.Ingredient ingredient) {  // доб рец
        if (ingredients.containsKey(id)) {
            throw new RuntimeException("Такой ингредиент уже есть");
        } else {
            ingredients.put(id++, IngredientService);
        }
        return IngredientService;
    }
    public com.example.web1.service.Ingredient getIngredientById(int id) {
        if (IngredientService.containsKey(id)) {
            return IngredientService.get(id);
        } else {
            throw new RuntimeException(" Такого ингредиента нет!");
        }
    }
}