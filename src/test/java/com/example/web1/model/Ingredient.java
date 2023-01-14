package com.example.web1.service;

public class Ingredient {
    private String nameIngredient;
    private int amount;    // кол-во
    private String unit;  // ед.измер
    private String nameIngredient;
    private int amount;    // кол-во инг
    private String unit;  // ед.измерения

    public Ingredient(String nameIngredient, int amount, String unit) {
        this.nameIngredient = nameIngredient;
        this.amount = amount;
        this.unit = unit;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public int getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }
}
