package com.mvm.kitchenmanager.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Employee> employees;
    private List<Dish> dishes;
    private IngredientStore ingredientStore;

    public void Restaurant() {
        employees = new ArrayList<Employee>();
        dishes = new ArrayList<Dish>();
        ingredientStore = new IngredientStore();
    }
}
