package com.core.java8.functionalProgramming.joining;

import java.util.stream.Collectors;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class CountingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// count the numbers of instructors who teaches online courses
		// stream.count
		
		long count = Instructors.getAll().stream().filter(Instructor :: isOnlineCourses).count();
		
		System.out.println(count);
		
		// collectors.counting 
		
		count = Instructors.getAll().stream().filter(Instructor :: isOnlineCourses).collect(Collectors.counting());
		
		System.out.println(count);
		
	}

}
