package com.referencemethods.exercices;

import java.util.function.BiFunction;  

class Multiplication{  
   public static int multiply(int a, int b){  
	return a*b;  
   }
   public static double division(double a, double b){  
	return a/b;  
   }  
}  

public class ReferenceMethoStatic {  
   public static void main(String[] args) {  
	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
	int pr = product.apply(11, 5);  
	System.out.println("Product of given number is: "+pr);  
	
	BiFunction<Double, Double, Double> division = Multiplication::division; 
	double dv = division.apply(11.4, 5.2);  
	System.out.println("division of given number is: "+dv);  
   }  
}
	

