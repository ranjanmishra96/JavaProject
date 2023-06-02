package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {

        // count

        Long count  = Instructors.getAll().stream()
                .map(Instructor:: getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();

        System.out.println(count);

        //distinct courses with Names

        List<String> courses = Instructors.getAll().stream()
                                .map(Instructor :: getCourses)
                                .flatMap(List ::stream)
                                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(courses);

        // anymatch , allmatch and nonmatch

        boolean match = Instructors.getAll().stream()
                                .map(Instructor :: getCourses)
                                .flatMap(List :: stream)
                                .anyMatch(s -> s.startsWith("J"));
        System.out.println(match);

        boolean allmatch = Instructors.getAll().stream()
                                    .map(Instructor :: getCourses)
                                    .flatMap(List :: stream)
                                    .allMatch(s-> s.startsWith("J"));
        System.out.println(allmatch);
        boolean  nonmatch = Instructors.getAll().stream()
                .map(Instructor :: getCourses)
                .flatMap(List :: stream)
                .noneMatch(s-> s.startsWith("J"));
        System.out.println(nonmatch);
    }
}
