package com.core.java8.functionalProgramming.consumer;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Mike", 10, "Software Developer","M",true, Arrays.asList("Java Programing","Python"));
        Instructor instructor2 = new Instructor("Jenny ", 25, "Software Developer","F",true, Arrays.asList("CICD","ML"));
        Instructor instructor3 = new Instructor("Ranjan", 45, "Software Developer","M",true, Arrays.asList("Java Programing","Python","GO","Nicroservices"));

        List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3);
        return list;
    }
}
