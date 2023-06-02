package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        // returning instructor sorted by their names and have more than 10 years of experience

        List<Instructor> instructors = Instructors.getAll().stream()
                                        .filter(instructor -> instructor.getYearsOfExperience() >10 )
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        instructors.forEach(System.out :: println);

    }
}
