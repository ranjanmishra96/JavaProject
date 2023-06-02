package com.core.java8.functionalProgramming.fault;

public interface InterfaceA {

    default void sumA(int num1,int num2){
        System.out.println("Interface.sumA " + (num1+num2));
    }
}
