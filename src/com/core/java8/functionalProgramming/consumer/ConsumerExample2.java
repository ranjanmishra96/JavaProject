package com.core.java8.functionalProgramming.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // looping through all the instructor and printing out the values of instructor

        Consumer<Instructor>  c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        System.out.println("--------------------*********************----------------------------------");
        // loop through all the instructor and only print out their name

        Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(c2);

        System.out.println("--------------------*********************----------------------------------");
        Consumer<Instructor> c3 = (s1) -> System.out.println(s1.getCourses());
       instructors.forEach(c2.andThen(c3));

        System.out.println("--------------------*********************----------------------------------");
        // loop through all the instructor and print out the name if the years of experience is > 10
        instructors.forEach(instructor -> {
            if(instructor.yearsOfExperience > 10){
                c1.accept(instructor);
            }
        });

        System.out.println("--------------------*********************----------------------------------");
        //loop through all the instructor and print out their name and years of experience > 5 and teaches course is online
        instructors.forEach(instructor -> {
            if(instructor.yearsOfExperience > 5 && !instructor.isOnlineCourses()){
                c1.andThen(c2).accept(instructor);
            }
        });
    }
}
