package com.example.web1.service;

import com.example.web1.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public class IngredientService {
    @Service
        private final Map<Long, Ingredient> ingredients = new HashMap<>();
            private static long lastId = 0;

        public Ingredient addIngredient(Ingredient ingredient) {
            if (ingredients.containsKey(ingredient.getId())) {
                throw new RuntimeException("Такой ингредиент уже есть");
            } else {
                ingredients.put(lastId++, ingredient);
            }
            return ingredient;
        }

        public Ingredient getById(String id) {
            if (ingredients.containsKey(id)) {
                return ingredients.get(id);
            } else {
                throw new RuntimeException("Такого инредиента нет");
            }
        }
    }
}


