package com.examples.model;

import org.springframework.stereotype.Component;

@Component
public class Exams {
	
	int examid;
	String name;
	int total;
	public Exams() {
		examid=9001;
		name="semester-1";
		total=80;
	}
	public Exams(int examid, String name, int total) {
		super();
		this.examid = examid;
		this.name = name;
		this.total = total;
	}
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Exams [examid=" + examid + ", name=" + name + ", total=" + total + "]";
	}
	

}
