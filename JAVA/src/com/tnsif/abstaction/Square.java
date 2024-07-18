package com.tnsif.abstaction;

public class Square extends Shape{
	private float side;
	public Square() {
		side=2.0f;
	}
	void calarea() {
		super.area=side*side;
	}
	
	

}
