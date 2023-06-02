package com.core.java8.functionalProgramming.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformanceExample {

    public static void main(String[] args) {
            int loop =20;
            long result = measurePerformance(StreamPerformanceExample::sumSequentialStream,loop);
        System.out.println("Time taken to process sum in sequential: " +result + " in secs");

        result =  measurePerformance(StreamPerformanceExample::sumParallelStream, loop);
        System.out.println("Time taken to process sum in parallel sequential: " +result + " in secs");

    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(0,50000).sum();
    }
    public static  int sumParallelStream(){
        return (IntStream.rangeClosed(0, 50000)).parallel().sum();
    }

    public static long measurePerformance(Supplier<Integer> supplier,  int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0 ;i < numberOfTimes ; i++){
            supplier.get();
        }
        return System.currentTimeMillis() -startTime;
    }
}
