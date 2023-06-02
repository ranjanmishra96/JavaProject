package com.designpatters.creational.factoryPattern;

import org.junit.Test;

public class TestMakePizza {

    @Test
    public void testMakePizza(){

        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("Veggie");
    }
}
