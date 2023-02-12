package service;

import java.util.Map;

public interface RecipeService {

    int add(model.Recipe recipe);
    model.Recipe get(int id);

    int change(int id, model.Recipe recipe);

    int delete(int id);

    Map<Integer, model.Recipe> getAll();
}