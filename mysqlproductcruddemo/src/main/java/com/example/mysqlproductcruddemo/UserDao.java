package com.example.mysqlproductcruddemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Users, String>{

}
