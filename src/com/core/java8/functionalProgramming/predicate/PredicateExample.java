package com.core.java8.functionalProgramming.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // if number is greater than 10 return true other false

        Predicate<Integer> p1 = (i) -> i > 10;
        System.out.println(p1.test(100));

        // i > 10 and i is even number

        Predicate<Integer> p2 = (i) -> i % 2 == 0 ;
        System.out.println(p1.and(p2).test(199));

        // i > 10 or number is even number

        System.out.println(p1.or(p2).test(4));

        /// i > 10 && i%2 !=0
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
