package com.core.java8.functionalProgramming.joining;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class GroupingByExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// group list by length 
		
		List<String> names = List.of("Syed", "Mike" ,"Jenny" ,"Gene","Rajeev");
		
		Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String :: length));
		
		System.out.println(result);
		
		// grouping the Instructors by Gender
		
		Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor :: getGender));
		
		instructorByGender.forEach( (key,value) -> {
			System.out.println("Key = "+ key + " Value " + value);
		});
		
		// grouping by experience where > 10 years of experience is classified as Senior and others as Juniors 
		
		Map<String,List<Instructor>> instructorbyExperience = Instructors.getAll().stream().collect(Collectors.groupingBy(
				instructor -> instructor.getYearsOfExperience() > 10 ? "seniors" : "juniors"));
	
		instructorbyExperience.forEach((key,value) -> {
			System.out.println("key  =" +key + " value :" +value) ;
		});
		
		Map<Integer,List<String>> res = names.stream().collect(
						Collectors.groupingBy(String :: length,Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
		System.out.println(res);
	}

}
