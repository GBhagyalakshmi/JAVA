package com.tnsif.overriding;

public class Child extends Father {
	@override
	int drinking() {
		System.out.print("holicks");
	}
	public static void main(String[] args[]) {
		Child c=new Child;
		c.drinking();
	}
}
