package com.example.microservices.noteservice.dto;

public class Comment {
	
	int cid;
	
	String comment;
	
	String commenter;
	
	int pid;
	
	public Comment() {
		super();
	}
	
	public Comment(int cid, String comment, String commenter, int pid) {
		super();
		this.cid = cid;
		this.comment = comment;
		this.commenter = commenter;
		this.pid = pid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommenter() {
		return commenter;
	}

	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	

}
