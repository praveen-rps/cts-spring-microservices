package com.example.mappings.many2manydemo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Many2manydemoApplication implements CommandLineRunner {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	CourseDao courseDao;

	public static void main(String[] args) {
		SpringApplication.run(Many2manydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.setId(1001L);
		student1.setName("John");
		/*
		Student student2 = new Student();
		student1.setId(1002L);
		student1.setName("Doe");
		*/
		Set<Student> students = new HashSet<>();
		students.add(student1);
		//students.add(student2);
		
		
		
		Course course1 = new Course();
		course1.setId(9001L);
		course1.setName("Java");
		
		student1.getCourses().add(course1);
	//	student2.getCourses().add(course1);
		Set<Course> courses = new HashSet<>();
		
		course1.setStudents(students);
		
		
		
		
		//course1.getStudents().add(student1);
		//course1.getStudents().add(student2);
		courseDao.save(course1);
		
		studentDao.save(student1);
	//	studentDao.save(student2);
		
		System.out.println("many2many mapping done..");
		
				
		
	}

}
