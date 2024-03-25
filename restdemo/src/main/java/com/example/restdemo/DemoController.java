package com.example.restdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	// localhost:8080/city/bangalore
	// localhost:8080/data/kumar/chennai
	
	@GetMapping("/data/{name}/{city}")
	public String greet3(@PathVariable("city")String city,
			@PathVariable("name")String name) {
		return "Hello "+name+" Welcome to "+city;
	}
	
	@GetMapping("/city/{city}")
	public String greet1(@PathVariable("city")String name) {
		return "Hello "+name+" Welcome to rest demo";
	}
	
	// http://localhost:8080/name/anil
	@GetMapping("/name/{name}")
	public String greet2(@PathVariable("name")String name) {
		return "Hello "+name+" Welcome to rest demo";
	}
	

	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping("/test6")
	public String test6(){
		return "response Data";
	}
	
	// new ReponseEntity<>("response Data",HttpStatus.ACCEPTED);
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<>("Response Data", HttpStatus.CREATED	);
	}
	
	@GetMapping("/test1")
	public ResponseEntity<Student> test1() {
		Student student = new Student(1, "praveen", "cse");
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	@PostMapping("/test2")
	public Student test2(@RequestBody Student student) {
		student.setName("Anil");
		return student;
	}
	@PutMapping("/test3")
	public String test3() {
		return "put mapping is called";
	}
	@DeleteMapping("/test4")
	public String test4() {
		return "delete3 mapping is called";
	}
}