package com.example.microservices.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.commentservice.model.Comment;
import com.example.microservices.commentservice.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	
	@GetMapping("/all")
	public List<Comment> showAllComments() {
		return commentService.showAllComments();
	}
	
	@PostMapping("/create")
	public Comment createComment(@RequestBody Comment comment) {
		return commentService.createComment(comment);
	}
	
	@GetMapping("/searchforpid/{pid}")
	public List<Comment> getCommentsForPid(@PathVariable int pid) {
		return commentService.getCommentsForPid(pid);
	}

}
