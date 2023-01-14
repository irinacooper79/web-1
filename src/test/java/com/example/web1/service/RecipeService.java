package com.example.web1.service;


import com.example.web1.controller.RecipeService;
import me.recipe.bookrecipes.model.Recipe;
import me.recipe.bookrecipes.servic.RecipeService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final Map<Integer, Recipe> recipes = new HashMap<>();

    private int id = 0;

    public Collection<Recipe> getAll() {// получение всех рец
        return recipes.values();
    }

    public Recipe getRecipeById(int id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        } else {
            throw new RuntimeException(" Такого рецепта нет!");
        }
    }

    public Recipe addRecipe(Recipe recipe) {
        if (recipes.containsKey(id)) {
            throw new RuntimeException("Такой рецепт уже есть!");
        } else {
            recipes.put(id++, recipe);
        }
        return recipe;
    }
}
