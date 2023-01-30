package service;

import java.util.Map;

public interface IngredientService {

    int add(model.Ingredient ingredient);

    model.Ingredient get(int id);

    int change(int id, model.Ingredient ingredient);

    int delete(int id);

       Map<Integer, model.Ingredient> getAll();
}