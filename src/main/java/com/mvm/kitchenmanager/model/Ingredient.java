package com.mvm.kitchenmanager.model;

import java.util.List;

public class Ingredient {
    private String name;
    private List<Dish> dishesUsedIn;

    public Ingredient(String name, List<Dish> dishesUsedIn) {
        this.name = name;
        this.dishesUsedIn = dishesUsedIn;
    }

    public void addDishUsedIn(Dish dish) {
        if(!dishesUsedIn.contains(dish)) {
            dishesUsedIn.add(dish);
        }
    }
}
