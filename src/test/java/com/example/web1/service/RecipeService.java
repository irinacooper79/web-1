package com.example.web1.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeService {
    private final Map<Integer, RecipeService> recipes = new HashMap<>();

    private int id = 0;

    public Collection<RecipeService> getAll() {// получение всех рец
        return recipes.values();
    }

    public RecipeService getById(int id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        } else {
            throw new RuntimeException(" Такого рецепта нет!");
        }
    }

    public RecipeService addRecipe(RecipeService recipe) {  // доб рец
        if (recipes.containsKey(id)) {
            throw new RuntimeException("Такой рецепт уже есть!");
        } else {
            recipes.put(id++, recipe);
        }
        return recipe;
    }
}