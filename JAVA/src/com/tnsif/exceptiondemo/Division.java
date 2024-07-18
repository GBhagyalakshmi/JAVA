package com.tnsif.exceptiondemo;

public class Division {
	public static void divide() {
		int a=6,b=0,c;
		try {
			c=a/b;
			System.out.println("Division"+c);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("exception caught:"+e.getMessage());
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception caugth:"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("exception caugth:"+e.getMessage());

		}
	}

}
