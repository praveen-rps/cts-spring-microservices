package com.example.microservices.noteservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.noteservice.dto.Comment;
import com.example.microservices.noteservice.model.Post;
import com.example.microservices.noteservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping("/all")
	public List<Post> showAllPosts(){
		return postService.displayAllPosts();
	}
	
	@PostMapping("/create")
	public Post createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}
	
	@GetMapping("/search/{pid}")
	public Post searchPost(@PathVariable int pid) {
		return postService.searchPost(pid);
	}
	
	// http://localhost:8081/posts/comments/1
	@GetMapping("/comments/{pid}")
	public List<Comment> getCommentsForPid(@PathVariable int pid) {
		return postService.getCommentsForPid(pid);
	}
	

}
