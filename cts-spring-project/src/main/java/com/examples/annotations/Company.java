package com.examples.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("company")
@Scope("prototype")
public class Company {
	
	int id;
	String name;
	String location;

	public Company() {
		super();
		id=90001;
		name="ABC Corporation";
		location="Hyderabad";
	}

	public Company(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
