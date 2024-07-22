package com.tnsif.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgeneric {
	public static void main(String[] args) {
		ArrayList <String> a1=new ArrayList <String>();
		a1.add("Bhagya");
		a1.add("Lakshmi");
		a1.add("Gundala");
		System.out.println("Elements"+a1);
		Iterator <String>itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
