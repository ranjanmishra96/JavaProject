package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findfirstAndAnyEx {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        Optional<Instructor> instructor = Instructors.getAll().stream().findAny();
        if(instructor.isPresent())
            System.out.println(instructor.get());

        instructor = Instructors.getAll().stream().findFirst();
        if(instructor.isPresent())
            System.out.println(instructor.get());
    }
}
