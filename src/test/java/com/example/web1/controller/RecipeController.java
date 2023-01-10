package com.example.web1.controller;

import com.example.web1.service.RecipeService;
public class RecipeController {
    @RestController
    @RequestMapping("/recipe")

    public class RecipeController {
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
