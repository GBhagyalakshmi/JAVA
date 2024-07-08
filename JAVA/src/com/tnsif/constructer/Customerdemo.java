package com.tnsif.constructer;

import java.util.Scanner;

public class Customerdemo {
	private static char[] Customer;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your address");
		String add=sc.nextLine();
		Customer c=new Customer();
		c.setCname(name);
		c.setCid(id);
		c.setCaddress(add);
		System.out.println(Customer);

	}

}
