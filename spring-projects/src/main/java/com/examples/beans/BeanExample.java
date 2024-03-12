package com.examples.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BeanExample {
	
	
	public BeanExample() {
		System.out.println("Bean example constructor is called");
	}

	public void service() {
		System.out.println("bean service is called...");
	}
	@PostConstruct  // initialization phase
	public void init() {
		System.out.println("initialization phase is called..");
	}
	@PreDestroy // destroy phase
	public void destroyPhase() {
		System.out.println("destroy phase called");
	}
}
