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

//  @ApiResponses(value = {  //я вообще не понял нужно ли это. В браузере и так отображается "схема".
//          @ApiResponse(
//                  responseCode = "200",
//                  description = "Рецепт был найден",
//                  content = {
//                          @Content(
//                                  mediaType = "application/json",
//                                  schema = @Schema(implementation = Recipe.class) //как это писать для Map<Integer, Recipe>?
//                          )
//                  }
//          )
//  })
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