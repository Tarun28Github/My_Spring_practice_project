package com.security.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.User;
import com.security.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getUser() {
		return this.service.getUser();
	}
	
	@GetMapping("/current-user")
	public String getLoggedUserName(Principal principle) {
		return principle.getName();
	}
	
}
