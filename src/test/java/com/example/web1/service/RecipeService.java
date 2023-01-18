package service;

import com.example.web1.controller.Transaction;

import java.util.Collection;

@Service

public class RecipeService {
    private final Map<Long, model.Recipe> recipes = new HashMap<Long, model.Recipe>();
    private static long lastId = 0;

    public Recipe addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe.getId())) {
            throw new RuntimeException("Такой рецепт уже есть");
        } else {
            recipes.put(lastId++, recipe);
        }
        return recipe;
    }

    public Recipe getById(String id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        } else {
            throw new RuntimeException("Такого рецепта нет");
        }
    }

    public Collection<model.Recipe> getAll() {


        public Transaction getTransacrtion ( long id){

            public long addTransaction (Transaction Object transaction = null;
            Object transaction1 = transaction;){
                return 0;
            }
        }
    }
}
