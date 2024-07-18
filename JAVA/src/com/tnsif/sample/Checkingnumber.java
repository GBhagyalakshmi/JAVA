package com.tnsif.sample;

import java.util.Scanner;

public class Checkingnumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int num=sc.nextInt();
	if(num == 0) {
		System.out.println("Zero");
	}
	else {
		System.out.println("Number");
	}

}
}

