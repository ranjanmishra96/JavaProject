package com.core.java8.functionalProgramming.joining;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class CollectorsSummingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sum  of Years of Experience of all instructor
		
		int sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor ::getYearsOfExperience));
		
		System.out.println(sum);
		
		// calculate average of years of experience of all instructors 
		
		double average = Instructors.getAll().stream()
							.collect(Collectors.averagingInt(Instructor ::getYearsOfExperience));
		
		System.out.println(average);
	}

}
