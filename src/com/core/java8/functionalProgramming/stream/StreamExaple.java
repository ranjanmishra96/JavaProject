package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExaple {

    public static void main(String[] args) {
        // creating a Map of names and courses of instructors who teaches online and have more than
        // 10 years of experiences

        Predicate<Instructor> p1 = i -> i.isOnlineCourses();
        Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10 ;
        List<Instructor> list = Instructors.getAll();
        Map<String, List<String>> map = list.stream().filter(p1).filter(p2).collect(Collectors.toMap(Instructor::getName,Instructor::getCourses));
        System.out.println(map);
    }
}
