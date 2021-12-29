package com.referencemethods.exercices;

import java.util.function.BiFunction;

public class ReferenceMethods {
    
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    
    public static <R, T> T equalityThings(R a, R b, BiFunction<R, R, T> merger) {
        return merger.apply(a, b);
    }
    
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    
    public static boolean equalsStrings3(String a, String b) {
        return a.equals(b);
    }
    
    public String appendStrings2(String a, String b) {
        return a + b;
    }
 
    public static void main(String[] args) {
        
    	ReferenceMethods myApp = new ReferenceMethods();

        // Calling the method mergeThings with a lambda expression
        System.out.println(ReferenceMethods.
            mergeThings("Hello ", "World!", (a, b) -> a + b));
        
        // Reference to a static method
        System.out.println(ReferenceMethods.
            mergeThings("Hello ", "World!", ReferenceMethods::appendStrings));
        
     // Reference to a static method
        System.out.println(ReferenceMethods.
        	equalityThings("Hello ", "World!", ReferenceMethods::equalsStrings3));

        // Reference to an instance method of a particular object        
        System.out.println(ReferenceMethods.
            mergeThings("Hello ", "World!", myApp::appendStrings2));
        
        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(ReferenceMethods.
            mergeThings("Hello ", "World!", String::concat));
    }
}