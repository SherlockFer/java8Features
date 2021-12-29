package com.overloading.examples;

// It cannot handle converting in two steps from int to a long and then to a Long.
public class overloading { 

	public static void play(Long l) { }
		
		
	public static void play(Long... l) { }
	
	
	public static void main(String[] args) {
//		play(4); // DOES NOT COMPILE
		play(4L); // calls the Long version }}
	}
}

// it works when is just one windening to the next broaden primitive values

//public class overloading { 
//
//	public static void play(long l) { }
//		
//		
//	public static void play(Long... l) { }
//	
//	
//	public static void main(String[] args) {
//		play(4); // DOES NOT COMPILE
//		play(4L); // calls the Long version }}
//	}
//}