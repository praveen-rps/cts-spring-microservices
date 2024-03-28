package com.example.microservices.noteservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.noteservice.dao.PostRepository;
import com.example.microservices.noteservice.dto.Comment;
import com.example.microservices.noteservice.model.Post;


@Service
public class PostServiceImpl implements PostService {
	
	//@Autowired
	//RestTemplate restTemplate;
	
	@Autowired
	FeginProxy proxy;
	
	@Autowired
	PostRepository postRepository;

	@Override
	public List<Post> displayAllPosts() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	@Override
	public Post searchPost(int pid) {
		// TODO Auto-generated method stub
		return postRepository.findById(pid).get();
	}

	@Override
	public List<Comment> getCommentsForPid(int pid) {
		// TODO Auto-generated method stub
		//return restTemplate.getForObject("http://localhost:8082/comments/searchforpid/"+pid, List.class);
		return proxy.getCommentsForPid(pid);
	}

}
