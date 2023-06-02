package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class StreamMapFilterReduceEx {

    public static void main(String[] args) {
        // total years of experience btw instructors

        int result =  Instructors.getAll().stream()
                            .filter(Instructor::isOnlineCourses)
                            .map(Instructor::getYearsOfExperience)
                            .reduce(0,Integer:: sum);
        System.out.println(result);
    }
}
