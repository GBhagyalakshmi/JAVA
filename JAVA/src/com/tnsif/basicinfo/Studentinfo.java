package com.tnsif.basicinfo;

import java.util.Scanner;

public class Studentinfo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollcall=sc.nextInt();
		String name=sc.next();
		int aadharno=sc.nextInt();
		String dept=sc.next();
		System.out.println("Enter the register rollnumber : "+rollcall);
		System.out.println("Enter the name of the student : "+name);
		System.out.println("Enter the aadharno of the student : "+aadharno);
		System.out.println("Enter the department of the student : "+dept);



		
	}

}
