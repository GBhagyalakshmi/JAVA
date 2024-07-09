package com.tnsif.staticexam;

public class Student {
	int rollno;
	String name;
	static String college="sriindu";//static method
	static void change() {
		college="CSE";
		
	}
	Student(int r,String n){
		rollno=r;
		name=n;
		
	}
    void display() {
	System.out.println(rollno+""+name+""+college);
	

}
}
