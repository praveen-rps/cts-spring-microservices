package com.examples.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaBeanConfigurations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Spring container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ModelConfigurations.class);
		
		Person person1 = ctx.getBean(Person.class);
		Person person2 = ctx.getBean(Person.class);
		System.out.println(person1);
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		
		// Department dept = ctx.getBean(Department.class);
		Department dept = (Department) ctx.getBean("dept2");
		System.out.println(dept);
		
		

	}

}
