package com.exercices.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExerStreams {
	
		
	public static void main( String[] args ) {
		
		//Empty Stream
		Stream<String> streamEmpty = Stream.empty();
		
		streamOf(Arrays.asList("1a", "1b", "1c")).forEach(System.out::println);;
		
		//Stream of Collection
		Collection<String> collection = Arrays.asList("2a", "2b", "2c");
		Stream<String> streamOfCollection = collection.stream();
		streamOfCollection.forEach(System.out::println);
		
		//Stream List
		List<String> myList=new ArrayList<>();
		myList.add("31a");
		myList.add("31b");
		myList.add("31c");
		myList.stream().forEach(System.out::println);
		
		//Stream of Collection enhanced
		Stream<String> streamOfCollection2 = Arrays.asList("3a", "3b", "3c").stream();
		streamOfCollection2.forEach(System.out::println);
		
		//Stream of Array
		Stream<String> streamOfArray = Stream.of("4a", "4b", "4c");
		streamOfArray.forEach(System.out::println);
		
		//Stream Builder
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("5a").add("5b").add("5c").build();
		streamBuilder.forEach(System.out::println);
		
		//Stream Generate
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		streamGenerated.forEach(System.out::println);
		
		//Stream.iterate
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		
		//Stream of Primitives
		IntStream intStream = IntStream.range(1, 3);
		intStream.forEach(System.out::println);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		longStream.forEach(System.out::println);
		
		//Random
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		doubleStream.forEach(System.out::println);
		
		//Stream of String
		
		IntStream streamOfChars = "abc".chars();
		streamOfChars.forEach(System.out::println);//result 97 98 99
		
		Stream<String> streamOfString =
				  Pattern.compile(", ").splitAsStream("a, b, c");
		streamOfString.forEach(System.out::println);//result a b c
		

	}
	
	public static Stream<String> streamOf(List<String> list) {
	    return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

}
