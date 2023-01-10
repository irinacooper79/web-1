package com.example.web1.controller;

public class IngredientController {
    @RestController
    @RequestMapping("/ingredient")

    public class IngredientController {
        private final IngredientService ingredientService;

        public IngredientController(IngredientService ingredientService) {
            this.ingredientService = ingredientService;
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
