package com.springboot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.dao.UserRepository;
import com.springboot.entities.User;

@SpringBootApplication
public class FirstSpringBootProject1Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 ApplicationContext context = SpringApplication.run(FirstSpringBootProject1Application.class, args);
	 
	   UserRepository ur = context.getBean(UserRepository.class);
	   
	   // save single user
	  	   
		/*
		 * User user = new User(); user.setName("Tomar Tarun singh");
		 * user.setCity("jaipur"); user.setStatus("Java Developer");
		 * 
		 * User user1 =ur.save(user);
		 * 
		 * System.out.println(user1);
		 */
	   
	   // save multiple user
	   
		/*
		 * User u1 = new User("pradeep","dausa","electrician"); User u2 = new
		 * User("himank","indor","developer");
		 * 
		 * Iterable<User> list = List.of(u1,u2);
		 * 
		 * Iterable<User> user = ur.saveAll(list); user.forEach(e->{
		 * System.out.println(e); });
		 */
	   
	   //read single user and multiple user
	     
		/*
		 * Optional<User> optional = ur.findById(1);
		 * 
		 * User user2 = optional.get();
		 * 
		 * System.out.println(user2);
		 * 
		 * Iterable<User> all = ur.findAll(); all.forEach(e->{ System.out.println(e);
		 * });
		 */
	   
	   //delete
		/*
		 * Optional<User> byId = ur.findById(52); User user = byId.get();
		 * ur.delete(user); ur.deleteAll();//delete all // delete specific one
		 * Iterable<Integer> iterable = List.of(53,3); ur.deleteAllById(iterable);
		 */
	   
	   // update
		/*
		 * Optional<User> opt = ur.findById(2); User user = opt.get();
		 * user.setCity("bharatpur");
		 * 
		 * User save = ur.save(user); System.out.println(save);
		 */       
	   
	   // executing jpql and native query method and custom finder methods
	   
       User userById = ur.getUserById(1);
       System.out.println(userById);
       
       User byCity = ur.findByCity("jaipur");
	   System.out.println(byCity);
	   
	   System.out.println("++++++++++++++++++++++++++++");
	   
	   User eachUserById = ur.getEachUserById(2);
	   System.out.println(eachUserById);
	   
	   System.out.println("+++++++++++++++++++++==");
	   
	   User eachUserByIdAndCity = ur.getEachUserByIdAndCity(3, "indor");
	   System.out.println(eachUserByIdAndCity);
	}

}
