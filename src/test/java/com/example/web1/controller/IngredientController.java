package controller;

import model.Ingredient;
import model.Recipe;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IngredientService;
import Request;
import java.util.Collection;

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