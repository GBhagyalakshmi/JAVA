package com.tnsif.exceptiondemo;

public class Main {
	public static void name(String[] args) {
		int d=0;
		try {
			int a=55/d;
			System.out.println("hello");
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled")
		}
		
	}

}
