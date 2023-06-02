package com.core.java8.functionalProgramming.stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

import java.util.Optional;

public class StreamReduceEx2 {

    public static void main(String[] args) {

        // printing the instructor who has the highest years of experience

      Optional instructor =  Instructors.getAll().stream().reduce((s1, s2) -> {
            if(s1.getYearsOfExperience()>s2.getYearsOfExperience())
                return s1;
            else
                return s2;
        });

      if(instructor.isPresent())
          System.out.println(instructor.get());
    }
}
