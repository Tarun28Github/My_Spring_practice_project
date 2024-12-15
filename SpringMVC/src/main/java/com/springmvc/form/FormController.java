package com.springmvc.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.User;
import com.springmvc.services.UserService;

@Controller
public class FormController {
	@Autowired
	private UserService userservice;

	@ModelAttribute
	public void commonData(Model m) {
		
		m.addAttribute("data ","This is springmvc project");
		System.out.println("Common data execute");
	}
	
	@RequestMapping("/contact")
	public String formHandler(Model m){
		System.out.println("formHandler execute");
		return "contact";
	}
	
	@RequestMapping(path="/showform",method = RequestMethod.POST)
	public String showform( @ModelAttribute User user ,Model model) {
		/*
		 * String name = req.getParameter("username"); String password =
		 * req.getParameter("password"); String email = req.getParameter("email");
		 */
		
		System.out.println(user);
		
		if(user.getUsername().isBlank()) {
			return "redirect:/contact";
		}
		
		int res=this.userservice.createUser(user);
		System.out.println("User save id= "+ res);
		return "showform";
	}
	
}
