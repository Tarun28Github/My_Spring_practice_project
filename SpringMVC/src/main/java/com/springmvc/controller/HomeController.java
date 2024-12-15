package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Tarun Singh");
		model.addAttribute("id",101);
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		
		model.addAttribute("list",list);		
		return "index";
	}
	
	@RequestMapping("/about") 
	public ModelAndView about() {
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name","Tarun Singh");
		modelandview.addObject("id",150);
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("Tarun","Ayush","pradeep","manish","Gopal","himank"));
	    modelandview.addObject("list",list);
	    modelandview.setViewName("about");		
		return modelandview; 
			
	}
}
