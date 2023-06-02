package com.core.java8.functionalProgramming.fault;

public interface InterfaceB {
    default void sumB(int num1, int num2){
        System.out.println("InterfaceB.sumB " + (num1+num2));
    }
    
    default void sumA(int num1, int num2){
        System.out.println("InterfaceB.sumB " + (num1+num2));
    }
}
