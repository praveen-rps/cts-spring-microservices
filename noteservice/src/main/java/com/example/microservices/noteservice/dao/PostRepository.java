package com.example.microservices.noteservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservices.noteservice.model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post,Integer>{

}
