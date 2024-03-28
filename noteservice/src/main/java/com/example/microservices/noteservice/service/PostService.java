package com.example.microservices.noteservice.service;

import java.util.List;



import com.example.microservices.noteservice.dto.Comment;
import com.example.microservices.noteservice.model.Post;

public interface PostService {
	
	public List<Post> displayAllPosts();
	public Post createPost(Post post);
	public Post searchPost(int pid);
	public List<Comment> getCommentsForPid(int pid);

}
