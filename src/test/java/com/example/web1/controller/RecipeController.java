package com.example.web1.controller;

import com.example.web1.model.Recipe;
import com.example.web1.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class RecipeController {
    @RestController
    @RequestMapping("/recipe")

         private final RecipeService recipeService;
        @GetMapping
        public Collection<Recipe> getAllRecipe() {
            return recipeService.getAll();
        }

        public RecipeController(RecipeService recipeService) {
            this.recipeService = recipeService;
        }
    }
}
