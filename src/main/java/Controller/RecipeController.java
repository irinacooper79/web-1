package Controller;

import model.Recipe;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RecipeService;

import java.util.Map;

@RestController
@RequestMapping("/recipe")

public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")

    public ResponseEntity<Recipe> getRecipe(@PathVariable int id) {
        return ResponseEntity.ok(recipeService.get(id));
    }

    @GetMapping

    public Map<Integer, Recipe> getAllRecipes() {
        return recipeService.getAll();
    }

    @PostMapping

    public ResponseEntity<?> addRecipe(@RequestBody Recipe recipe) {

            int result = recipeService.add(recipe);
            return ResponseEntity.ok(result);

    }

    @PutMapping("/{id}")

    public ResponseEntity<Integer> changeRecipe(@PathVariable int id, @RequestBody Recipe recipe) {

            int result = recipeService.change(id, recipe);
            return ResponseEntity.ok(result);

    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Integer> deleteRecipe(@PathVariable int id) {

            int result = recipeService.delete(id);
            return ResponseEntity.ok(result);

    }
}