package com.example.web1.controller;

import com.example.web1.model.Ingredient;
import com.example.web1.service.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public class IngredientController {
    @RestController
    @RequestMapping("/ingredient")

        private final IngredientService ingredientService;
        public IngredientController(IngredientService IngredientService) {
            this.ingredientService = IngredientService;
        }
        @GetMapping
        public Collection<Ingredient> getAllIngredient() {
            return ingredientService.getAll();
        }
        @PostMapping
        public Ingredient createIngredient (@RequestBody Ingredient ingredient){
            return this.ingredientService.addIngredient(ingredient);
        }
    }
}
