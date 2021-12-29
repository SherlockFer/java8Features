package com.java8.examples;

import java.util.Random;
import java.util.stream.Stream;

public class example2 {
	
	public static void main(String[] args) {
		
	Random random = new Random();
     Stream.generate(
       () -> {return random.nextInt(100);} // generating random numbers between 0 and 99
     )
     .limit(10).forEach(System.out::println);
     
	}
}
