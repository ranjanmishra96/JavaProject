package com.core.java8.functionalProgramming.stream;

import javax.swing.plaf.OptionPaneUI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxMinEx {

    public static void main(String[] args) {

        // max using stream max function
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        Optional results = numbers.stream().max(Integer::compareTo);
        if(results.isPresent())
            System.out.println(results.get());

        int results2 = numbers.stream().reduce(0,(a,b) -> a>b ? a:b);
        System.out.println(results2);
        Optional results3 = numbers.stream().reduce((a,b) -> a>b ?a :b);
        if(results3.isPresent())
            System.out.println(results3.get());

        Optional result4 = numbers.stream().reduce(Integer:: sum);
        if(result4.isPresent())
            System.out.println(result4.get());


        System.out.println("**************************************************");

        Optional results5 = numbers.stream().min(Integer::compareTo);
        if(results5.isPresent())
            System.out.println(results5.get());

        // reduce function

        int res = numbers.stream().reduce(0,(a,b) -> a < b ?a :b); //

        Optional res1 = numbers.stream().reduce( (a,b) -> a < b ? a :b);
        System.out.println(res1.get());


    }
}
