package com.tnsif.staticexam;

public class Employee {
	int eid;
	String name;
	static String company="TATA";//static member
	static void change() {
		company="CSE";
	}
	Employee(int r,String n){
		eid=r;
		name=n;
		
	}
	void display() {
		System.out.println(edi+""+name+""+company);
	}

}
