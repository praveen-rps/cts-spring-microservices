package com.examples.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("square")
//@Primary
public class Square implements Shape{
	
	private int side;
	public Square() {
		super();
		side = 4;
	}
	

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
