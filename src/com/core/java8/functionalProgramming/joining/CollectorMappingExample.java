package com.core.java8.functionalProgramming.joining;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class CollectorMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map
		List<String> namesList = Instructors.getAll().stream().map(Instructor :: getName)
									.collect(Collectors.toList());
		
		namesList.forEach(System.out :: println);
		
		
		// mapping 
		namesList = Instructors.getAll().stream()
						.collect(Collectors.mapping(Instructor :: getName, Collectors.toList()));
		
		namesList.forEach(System.out ::println);
		
		// Instructor by their of years ofExperience 
		
		Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        mapYearsOfExperienceAndNames.forEach((key,value) ->{
            System.out.println("key = " + key + " value = " + value);
        });
	}

}
