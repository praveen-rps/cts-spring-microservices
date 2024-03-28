package com.example.microservices.noteservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.noteservice.dto.Comment;

@FeignClient(name="commentservice",url="http://localhost:8082/comments")
public interface FeginProxy {
	
	@GetMapping("/searchforpid/{pid}")
	public List<Comment> getCommentsForPid(@PathVariable int pid);

}
