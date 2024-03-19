package com.example.mappings.one2onedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mappings.one2onedemo.dao.UserDao;
import com.example.mappings.one2onedemo.dao.UserProfileDao;
import com.example.mappings.one2onedemo.model.User;
import com.example.mappings.one2onedemo.model.UserProfile;

@SpringBootApplication
public class One2onedemoApplication implements CommandLineRunner {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserProfileDao userProfileDao;

	public static void main(String[] args) {
		SpringApplication.run(One2onedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		UserProfile userProfile = new UserProfile();
        userProfile.setAddress("123 Main St");
        
       

        User user = new User();
        user.setName("John Doe");
        user.setUserProfile(userProfile);
       

        userProfile.setUser(user);
        

        userDao.save(user);
        userProfileDao.save(userProfile);
       
        System.out.println("one2one mapping done..");

		
	}

}
