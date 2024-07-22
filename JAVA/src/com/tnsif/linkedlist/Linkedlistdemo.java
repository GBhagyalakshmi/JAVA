package com.tnsif.linkedlist;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Bhhagya");
		l.add(2);
		l.add("Lakshmi");
		l.add(8.9);
		System.out.println(l);
		l.add(1,"GUNDALA");
		System.out.println(l);
		LinkedList l1=new LinkedList();
		l1.add(l);
		l1.add("Abhi");
		l1.add(l);
		System.out.println(l1);
		l1.addFirst("Gundala");
		l1.addLast("LAKSHMI");
		l.remove(1);
		System.out.println(l1);
		
		
		

		
	}

}
