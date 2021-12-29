package com.java8.examples;

public class Koalatester {
public static void main(String[] args) {
//Koala.main(new String[0]); // call static method }

Koala k = new Koala();
System.out.println(k.count); // k is a Koala
k = null;
System.out.println(k.count); // k is still a Koala
}
}