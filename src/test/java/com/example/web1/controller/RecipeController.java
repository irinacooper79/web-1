package controller;

import service.RecipeService;

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