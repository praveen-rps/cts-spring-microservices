package com.examples.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ShapeService {
	
	@Autowired
	@Qualifier("square")
	Shape shape;
	
	public void printArea() {
		System.out.println("The area is :"+shape.area());
	}

}
