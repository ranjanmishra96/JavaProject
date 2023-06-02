package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        // return instructor names from instructor List

        List<String>  instructorsNames = Instructors.getAll().stream().map(Instructor :: getName).collect(Collectors.toList());
        System.out.println(instructorsNames);


    }
}
