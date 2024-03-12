package com.examples.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.model.Person;

public class TestBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		/*
		Address adr = (Address)context.getBean("address");
		System.out.println(adr);
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		*/
		BeanExample be = (BeanExample) context.getBean(BeanExample.class);
		be.service();

	}

}
