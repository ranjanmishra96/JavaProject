package com.core.java8.functionalProgramming.joining;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class JoiningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = Stream.of("E","F","G","H").collect(Collectors.joining());
		System.out.println(result);
		
		result = Stream.of("E","F","G","H").collect(Collectors.joining(","));
		System.out.println(result);
		
		result = Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
		System.out.println(result);

		
		// instructors names separated by ' and prefix { and Suffix }
		
		String namesContcatenated = Instructors.getAll().stream()
											.map(Instructor :: getName)
											.collect(Collectors.joining(",","{","}"));
		System.out.println(namesContcatenated);
	}

}
