package com.example.microservices.noteservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	
	@Id
	int pid;
	
	String author;
	
	String title;
	
	String description;
	
	public Post() {
		super();
    }
	
	public Post(int pid, String author, String title, String description) {
		super();
        this.pid = pid;
        this.author = author;
        this.title = title;
        this.description = description;
    }

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
