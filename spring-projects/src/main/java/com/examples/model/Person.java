package com.examples.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.beans.Address;

@Component("person")
public class Person {
	
	int pid;
	String name;
	
	@Autowired
	Address address;
	
	@Autowired
	Exams exams;
	
	public Person() {
		pid=9001;
		name="kumar";
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", exams=" + exams + "]";
	}

	

	
	

}
