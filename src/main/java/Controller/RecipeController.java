package com.example.web1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/recipe")

public class RecipeController {
    private final com.example.web1.service.RecipeService recipeService;
    private com.example.web1.model.Recipe recipe;

    public RecipeController(com.example.web1.service.RecipeService recipe) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")

    public ResponseEntity<com.example.web1.model.Recipe> getRecipe(@PathVariable int, id); {
        return ResponseEntity.ok(recipeService.get(id));
    }

    @GetMapping

    public Map<Integer, com.example.web1.model.Recipe> getAllRecipes() {
        return recipeService.getAll();
    }

    @PostMapping

    public ResponseEntity<?> addRecipe(@RequestBody com.example.web1.model.Recipe recipeService) {
        this.recipe = recipe;
        try {
            int result = recipeService.add(recipe);
            return ResponseEntity.ok(result);
        } catch (RecipeAddException e) {
            return ResponseEntity.badRequest().body(recipe);

            @PutMapping("/{id}")
            ResponseEntity<Integer> changeRecipe; (@RequestBody int id, com.example.web1.model.Recipe recipe)
            {
                try {
                    int result = recipeService.change(@RequestBody id, recipe);
                    return ResponseEntity.ok(result);
                } catch (RecipeAddException e) {
                    return ResponseEntity.badRequest().body(id);


                    @DeleteMapping("/{id}")

                    public ResponseEntity<Integer> deleteRecipe (@PathVariable int, id){
                        try {
                            int result = recipeService.delete(id);
                            return ResponseEntity.ok(result);
                        } catch (RecipeAddException e) {
                            return ResponseEntity.badRequest().body(id);
                        }
                    }
                }
            }
        }
    }
}