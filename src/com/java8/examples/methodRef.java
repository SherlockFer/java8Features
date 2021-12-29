package com.java8.examples;

interface Interf
{
	public void m1();
}

public class methodRef {
	public static void m2() {
		System.out.println("Implementation by method reference");
	}
	
	public static void main(String[] args) {
	Interf  i=methodRef::m2;
 	i.m1();
	}

}
