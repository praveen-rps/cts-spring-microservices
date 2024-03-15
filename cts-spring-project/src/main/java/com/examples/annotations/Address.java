package com.examples.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	int dno;
	String street;
	String city;
	String state;

	public Address() {
		super();
		dno=100;
		street="Gandhi Road";
		city="Hyderabad";
	}

	public Address(int dno, String street, String city, String state) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Address object is initialized");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Address object is destroyed");
	}
}
