package com.example.web1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")

public class IngredientController {

    private final com.example.web1.service.IngredientService ingredientService;

    public IngredientController(com.example.web1.service.IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/{id}")

    public com.example.web1.model.Ingredient getIngredient(@PathVariable int id) {
        return ingredientService.get(id);
    }

    @GetMapping

    public Map<Integer, com.example.web1.model.Ingredient> getAllIngredients() {
        return ingredientService.getAll();
    }

    @PostMapping

    public <IngredientAddException extends Throwable> ResponseEntity<?> addIngredient(@RequestBody com.example.web1.model.Ingredient ingredient) {
        try {
            int result = ingredientService.add(ingredient);
            return ResponseEntity.ok(result);
        } catch (IngredientAddException e ) {
            return ResponseEntity.badRequest().body(ingredient);
        }
    }
    @PutMapping("/{id}")

    public ResponseEntity<Integer> changeRecipe(@PathVariable int id, @RequestBody com.example.web1.model.Ingredient ingredient) {
        try {
            int result = ingredientService.change(id, ingredient);
            return ResponseEntity.ok(result);
        } catch (IngredientChangeException e) {
                        return ResponseEntity.badRequest().body(id);
        }
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Integer> deleteIngredient(@PathVariable int id) {
        try {
            int result = ingredientService.delete(id);
            return ResponseEntity.ok(result);
        } catch (IngredientDeleteException e) {
            return ResponseEntity.badRequest().body(id);
        }
    }
}