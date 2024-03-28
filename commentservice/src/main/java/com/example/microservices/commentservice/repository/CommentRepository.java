package com.example.microservices.commentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservices.commentservice.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer>{
	
	List<Comment> findAllByPid(int pid);

}
