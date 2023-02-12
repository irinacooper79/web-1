package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @NonNull
    private String name;
    @NonNull
    private int preparingTime;
    @NonNull
    private List<model.Ingredient> ingredients;
    @NonNull
    private List<String> steps;

    public int add(Recipe recipe) {
        return 0;
    }

   }