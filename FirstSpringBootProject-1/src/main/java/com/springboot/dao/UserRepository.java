package com.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	//creating finders method
	
	public User findByName(String name);
	
	public User findByCity(String city);
	
	//exicuting jpql and native sql query
	
	@Query("select u from User u ")
	public List<User> getAllUser();
	
	@Query("select u from User u where id=:n")
	public User getUserById(@Param("n")int id);
	
	@Query("select u from User u where id=:n and city=:x" )
	public User getUserByNameandcity(@Param("n")int id ,@Param("x") String city);
    
	@Query(value="select * from user;",nativeQuery = true)
	public List<User> getEachUser();
	
	@Query(value="select * from user  where id=?" , nativeQuery = true)
	public User getEachUserById(int id);

	@Query(value="select * from user  where id=? and city=?" , nativeQuery = true)
	public User getEachUserByIdAndCity(int id, String city);
	
}
