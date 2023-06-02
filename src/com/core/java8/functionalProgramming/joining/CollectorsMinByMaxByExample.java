package com.core.java8.functionalProgramming.joining;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class CollectorsMinByMaxByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Instructor> instructor = Instructors.getAll().stream()
												.collect(Collectors.minBy(Comparator.comparing(
														Instructor :: getYearsOfExperience)));
		
		System.out.println(instructor);
		
		instructor = Instructors.getAll().stream().min(Comparator.comparing(Instructor :: getYearsOfExperience));
		
		System.out.println(instructor);
		
		Optional<Instructor> instructorMax = Instructors.getAll().stream()
				.collect(Collectors.maxBy(Comparator.comparing(
						Instructor :: getYearsOfExperience)));

System.out.println(instructorMax);

instructorMax = Instructors.getAll().stream().max(Comparator.comparing(Instructor :: getYearsOfExperience));

System.out.println(instructorMax);


	}

}
