package com.mvm.kitchenmanager.model;

import java.util.List;

public class Dish {
    private String name;
    private List<Ingredient> ingredients;
    private int cost;

    public Dish(String name, List<Ingredient> ingredients, int cost) {
        this.name = name;
        this.ingredients = ingredients;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
