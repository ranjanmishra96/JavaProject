package com.core.java8.functionalProgramming.biconsumer;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // To print name and gender of the Instructor

        BiConsumer<String, String> ci = (name, gender) -> System.out.println("name is " +name+ " Gender is " + gender);
        instructors.forEach(instructor -> ci.accept(instructor.getName(),instructor.getGender()));

        // print out the name and list of courses

        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is :" +name +" Courses are :" +courses);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(),instructor.getCourses()));
    }
}
