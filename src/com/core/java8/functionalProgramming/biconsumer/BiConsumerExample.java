package com.core.java8.functionalProgramming.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // printing two numbers

        BiConsumer<Integer, Integer> biConsumer = (x,y) -> System.out.println("x :" +x + "y: `" +y);
        biConsumer.accept(10,20);


        BiConsumer<String, String> ci = (x,y) -> System.out.println(x+y);
        ci.accept("Only one" ,"Only tow");
    }
}
