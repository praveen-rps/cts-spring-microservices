package com.example.mappings.one2onedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mappings.one2onedemo.dao.TUserDao;
import com.example.mappings.one2onedemo.dao.TUserProfileDao;
import com.example.mappings.one2onedemo.model.TUserProfile;
import com.example.mappings.one2onedemo.model.Tuser;

@SpringBootApplication
public class One2onedemoApplication implements CommandLineRunner {
	
	@Autowired
	TUserDao userDao;
	
	@Autowired
	TUserProfileDao userProfileDao;

	public static void main(String[] args) {
		SpringApplication.run(One2onedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Below code will implement one to one bidirectional 
		 * 
		UserProfile userProfile = new UserProfile();
        userProfile.setAddress("123 Main St");
        
       

        User user = new User();
        user.setName("John Doe");
        user.setUserProfile(userProfile);
       

        userProfile.setUser(user);
        

        userDao.save(user);
        userProfileDao.save(userProfile);
       
        System.out.println("one2one mapping done..");

		*/
		
		// below code will implement one to one unidirectional
		
		TUserProfile tprofile1 = new TUserProfile(900001L,"user1@gmail.com");
		Tuser tuser1 = new Tuser(100001L,"user1",tprofile1);
		
		TUserProfile tprofile2 = new TUserProfile(900002L,"user2@gmail.com");
		Tuser tuser2 = new Tuser(100002L,"user2",tprofile2);
		
		userDao.save(tuser1);
		userDao.save(tuser2);
		System.out.println("one2one mapping done..");
		
		Iterable<Tuser> users = userDao.findAll();
        users.forEach(System.out::println);
        
        // Update a UserD
        Tuser existingUser = userDao.findById(2L).orElse(null);
        if (existingUser != null) {
            existingUser.setName("Jane Doe");
            userDao.save(existingUser);
        }

        //Delete a User
        userDao.deleteById(1L);


	
	}

}
