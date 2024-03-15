package com.examples.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("rectangle")
@Primary
public class Rectangle implements Shape{

	private int length;
	private int breadth;
	
	public Rectangle() {
		super();
		length=2;
		breadth=3;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public int area() {
		return length * breadth;
	}
	//<!getters and setters for length and breadth>
	//<!getters and setters for length and breadth>
	
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	public int getLength() {
		return length;
	}
	
}
