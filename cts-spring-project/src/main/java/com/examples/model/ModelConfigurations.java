package com.examples.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ModelConfigurations {
	
	@Bean("dept1")	
	public Department getDepartment1() {
		return new Department(9001,"Sales","Mumbai");
	}
	
	@Bean("dept2")	
	public Department getDepartment2() {
		return new Department(9002,"Finance","Chennai");
	}

	@Bean
	@Scope("prototype")
	public Person getPerson() {
		return new Person(1001, "Raj", "Mumbai");
	}
}
