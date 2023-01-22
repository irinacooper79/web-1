package com.example.web1.service;

import java.util.Map;

public interface RecipeService {
    //добавление рецепта в карту. Возвращает id в случае успеха.
    int add(com.example.web1.model.Recipe recipe);

    //получение рецепта из карты
    com.example.web1.model.Recipe get(int id);

    //замена рецепта под данным номером в карте. Возвращает id в случае успеха.
    int change(int id, com.example.web1.model.Recipe recipe);

    //удаление рецепта по номеру. Возвращает id в случае успеха.
    int delete(int id);

    //получение всех рецептов
    Map<Integer, com.example.web1.model.Recipe> getAll();
}