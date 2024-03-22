package com.project.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	@GetMapping("/validate")
	public String validate(@RequestParam String loginid, 
			@RequestParam("password") String password) {

		if (loginid.equals("praveen") && password.equals("1234"))
			return "valid";
		else
			return "invalid";
	}

}
