package com.core.java8.functionalProgramming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println(names);
        names.remove("Syed");
        System.out.println(names);


        Stream<String> namesString = names.stream();
        namesString.forEach(System.out :: println);

        namesString.filter(s -> s.startsWith("M")).collect(Collectors.toList());
    }
}
