package com.core.java8.functionalProgramming.optional;

import java.util.Optional;

public class OptionalOfEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Optional<String> optionalString = Optional.of(null);
//		System.out.println(optionalString);
		
		System.out.println(getWords());

	}
	
	public static Optional<String> getWords(){
		String[] words = new String[10];
		Optional<String> optionals = Optional.ofNullable(words[1]);
		if(optionals.isPresent()) {
			return optionals ;
		}else {
			return Optional.empty();
		}
	}

}
