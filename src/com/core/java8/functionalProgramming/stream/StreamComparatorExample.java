package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {

        // returning all instructos sorted by their name

        List<Instructor> list = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName))
                                        .collect(Collectors.toList());
        list.forEach(System.out :: println);
    }
}
