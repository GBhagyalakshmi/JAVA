package com.tnsif.finalkeyword;

public class Finaldemo {//we if class as a final it cannot be inherited or override or change
	final int x=10;
	static final int y;//final
	final void change() {
		System.out.println("Default");
		
	}
	static {
		y=7;//we can initialize the values in static
	}	

}
