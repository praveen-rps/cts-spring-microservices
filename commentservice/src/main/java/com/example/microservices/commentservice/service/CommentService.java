package com.example.microservices.commentservice.service;

import java.util.List;

import com.example.microservices.commentservice.model.Comment;

public interface CommentService {
	
	public List<Comment> showAllComments();
	public Comment createComment(Comment comment);
	public List<Comment> getCommentsForPid(int pid);

}
