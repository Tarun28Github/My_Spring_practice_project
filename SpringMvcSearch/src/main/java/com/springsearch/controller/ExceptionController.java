package com.springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	
	@RequestMapping("/user/{userid}/{username}")
	public String userdetails(@PathVariable("userid") int id, @PathVariable("username") String name) {
		System.out.println(id +" "+ name);
		return "search";
	}
	
	@RequestMapping("/page")
	public String page() {
		String id = null;
		System.out.println(id.length());
		return "search";
	}

	/*
	 * @RequestMapping("/page2") public String page2() {
	 * 
	 * return ""; }
	  in this case http 404 occure exception does not handle*/

	/*@ExceptionHandler(value = Exception.class)
	public String ExceptionMethod() {
		return "exception"; }*/
	
}
