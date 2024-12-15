package com.springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springsearch.entities.Student;

@Controller
public class ComplexController {

	@RequestMapping("/complexform")
	public String complexform() {
		return "complexform";
	}
	
	@RequestMapping(path="/showform" , method=RequestMethod.POST)
	public String showform(@ModelAttribute("student") Student student,BindingResult result) {
		System.out.println(student);
		
		if(result.hasErrors()) {
			return "complexform";
		}
		return "showform";
	}
}
