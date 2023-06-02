package com.designpatters.creational.factoryPattern;

public class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredient for Veggie Pizza");
    }
}
