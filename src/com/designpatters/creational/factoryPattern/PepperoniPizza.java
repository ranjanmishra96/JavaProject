package com.designpatters.creational.factoryPattern;

public class PepperoniPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for Pepperoni Pizza ");
    }
}
