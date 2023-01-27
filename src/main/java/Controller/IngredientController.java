package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")

public class IngredientController {

    private final service.IngredientService ingredientService;

    public IngredientController(service.IngredientService ingredientService) {
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

    public <IngredientAddException extends Throwable> ResponseEntity<?> addIngredient(@RequestBody com.example.web1.model.Ingredient ingredient) throws IngredientAddException {
        int result = ingredientService.add(ingredient);
        return ResponseEntity.ok(result);
    }
    @PutMapping("/{id}")

    public ResponseEntity<Integer> changeRecipe(@PathVariable int id, @RequestBody com.example.web1.model.Ingredient ingredient) {

            int result = ingredientService.change(id, ingredient);
            return ResponseEntity.ok(result);

            }
    @DeleteMapping("/{id}")

    public ResponseEntity<Integer> deleteIngredient(@PathVariable int id) {

            int result = ingredientService.delete(id);
            return ResponseEntity.ok(result);



    }
}