package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
	    //Note: both array and list pointed out to the same object 
	    String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list 
		System.out.println(list.size()); // 2
		System.out.println(list.size());
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		array[1] = "element in Array"; // [new, test]
		for (String b : array)
			System.out.print(b + " "); // new test
		System.out.println(" "); 
		System.out.print(array[0]+" "+ array[1]);
//		list.remove(1); // twhors an exception because you are not allowed to change  size of an array
	
	
	
		//Sort numbers
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(99);
		numbers.add(5);
		numbers.add(81); 
		Collections.sort(numbers); 
		System.out.println(numbers); //[5, 81, 99]
	}

}
