package com.tnsif.finalblock;
//exception with no mathing catch block
public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException e) {
			System.out.println("welcome");
		}
		finally {
			System.out.prinln("Bhagya");
		}
	}
	

}
