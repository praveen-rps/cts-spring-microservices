package com.example.microservices.commentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.commentservice.model.Comment;
import com.example.microservices.commentservice.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> showAllComments() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

	@Override
	public Comment createComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepository.save(comment);
	}

	@Override
	public List<Comment> getCommentsForPid(int pid) {
		// TODO Auto-generated method stub
		return commentRepository.findAllByPid(pid);
	}

}
