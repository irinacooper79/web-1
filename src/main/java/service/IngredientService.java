package service;

import java.util.Map;

public interface IngredientService {
    //добавление ингредиента в карту. Возвращает id в случае успеха.
    int add(com.example.web1.model.Ingredient ingredient);

    //получение ингредиента из карты
    com.example.web1.model.Ingredient get(int id);

    //замена ингредиента под данным номером в карте. Возвращает id в случае успеха.
    int change(int id, com.example.web1.model.Ingredient ingredient);

    //удаление ингредиента по номеру. Возвращает id в случае успеха.
    int delete(int id);

    //получение всех ингредиентов
    Map<Integer, com.example.web1.model.Ingredient> getAll();
}