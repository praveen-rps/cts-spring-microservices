package com.example.mappings.many2manydemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long>{

}
