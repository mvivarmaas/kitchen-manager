package com.mvm.kitchenmanager.model;

import java.util.HashMap;
import java.util.Map;

public class IngredientStore {
    private Map<Ingredient, Integer> stock;

    public void IngredientStore() {
        this.stock = new HashMap<Ingredient, Integer>();
    }

    public void addIngredient(Ingredient ingredient) {
        stock.putIfAbsent(ingredient, 0);
    }
    public void removeIngredient(Ingredient ingredient) {
        stock.remove(ingredient);
    }
    public void setIngredientQuantity(Ingredient ingredient, int quantity) {
        if(stock.containsKey(ingredient)) {
            stock.replace(ingredient, quantity);
        }
    }
    public void incrementIngredientQuantity(Ingredient ingredient) {
        if(stock.containsKey(ingredient)) {
            stock.replace(ingredient,
                    stock.get(ingredient) + 1);
        }
    }
    public void decrementIngredientQuantity(Ingredient ingredient) {
        if(stock.containsKey(ingredient)) {
            stock.replace(ingredient,
                    stock.get(ingredient) - 1);
        }
    }
}
