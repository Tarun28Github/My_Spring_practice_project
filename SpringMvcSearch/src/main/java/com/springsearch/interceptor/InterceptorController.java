package com.springsearch.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home handler");
		return "home";
	}
	
	@RequestMapping("/welcome")
	public String welcomeUser(@RequestParam("userName") String name,Model m ) {
		
		System.out.println("this is welcomeUser handler");
		
		m.addAttribute("name",name);
	
		return "welcome";
	}
}
