package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        // Get the list ofall the courses which instructor offers

        List<String> instructorcourses = Instructors.getAll().stream().map(Instructor:: getCourses).
                                            flatMap(List :: stream).collect(Collectors.toList());


        System.out.println(instructorcourses);


    }
}
