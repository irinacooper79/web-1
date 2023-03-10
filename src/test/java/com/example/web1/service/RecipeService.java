package com.example.web1.service;

public class RecipeService {
    @Service

    public class RecipeService {
        private final Map<Long, Recipe> recipes = new HashMap<Long, Recipe>();
        private static long lastId = 0;

        public Recipe addRecipe(Recipe recipe) {
            if (recipes.containsKey(recipe.getId())) {
                throw new RuntimeException("Такой рецепт уже есть");
            } else {
                recipes.put(lastId++, recipe);
            }
            return recipe;
        }
        public Recipe getById (String id){
            if (recipes.containsKey(id)){
                return recipes.get(id);}
            else {
                throw new RuntimeException("Такого рецепта нет");
            }
        }
    }
