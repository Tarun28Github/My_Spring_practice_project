package com.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	
	public int createUser(User user) {
		
		int id = this.userdao.saveUser(user);
		return id;
	}

}
