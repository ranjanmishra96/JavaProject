package com.core.java8.functionalProgramming.parallelStream;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {

        System.out.println("Sum Sequential: " +sumSequentialStream());

        System.out.println("Sum Sequential: " +sumParallelStream());

    }

    public static int   sumSequentialStream(){
        return IntStream.rangeClosed(0,5000).sum();

    }

    public static  int sumParallelStream(){
        return (IntStream.rangeClosed(0, 5000)).parallel().sum();
    }
}
