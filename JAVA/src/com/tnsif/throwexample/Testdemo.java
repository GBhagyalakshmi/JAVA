package com.tnsif.throwexample;

import java.util.Scanner;

public class Testdemo {
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rollno");	
		int rollno=sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("rollno canot be negative ");
		}
		else {
			System.out.println("Valid rollcall");  
		}
		
		}

}
