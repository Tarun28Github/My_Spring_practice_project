package com.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.security.model.User;

@Service
public class UserService {
	
	List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"TomarTarun","Tarun@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Pradeep","Pradeep@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Manish","Manish@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ayush","Ayush@gmail.com"));
	}

	public List<User> getUser() {
		return this.store;
	}
}
