package service;

import model.Ingredient;
import model.Recipe;
import stereotype.Service;

import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Service

public class IngredientService {
    private final Map<Long, Ingredient> ingredients = new HashMap<>();
    private static long lastId = 0;

    public Ingredient addIngredient(Ingredient ingredient) {
        if (ingredients.containsKey(ingredient.getId())) {
            throw new RuntimeException("Такой ингредиент уже есть");
        } else {
            ingredients.put(lastId++, ingredient);
        }
        return ingredient;
    }
    public Ingredient getById (String id){
        if (ingredients.containsKey(id)){
            return ingredients.get(id);}
        else {
            throw new RuntimeException("Такого инредиента нет");
        }
    }

    public Collection<model.Ingredient> getAll() {

    }
}
