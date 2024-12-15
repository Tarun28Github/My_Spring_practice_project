package com.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewController {

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "This is my first spring boot project";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
