package com.java8.ExerOptional;

import java.util.Optional;

public class ExercOptional {
	
	public static void main( String[] args ) {
		
		String nameM=null;
		
		if(nameM != null) {
		    System.out.println(nameM.length());
		}
		
		Optional<String> opt = Optional.ofNullable(nameM);
		System.out.println(opt.get());
	
		String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    System.out.println(name);
	}

}
