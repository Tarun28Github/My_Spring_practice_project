package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one() {
		
		System.out.println("this is one handler");
		RedirectView rv = new RedirectView();
		rv.setUrl("two");
		return rv;
	}
	
	@RequestMapping("/two")
	public RedirectView two() {
		String data ="youtube";
		String query = "https://www.google.com/search?q="+data;
		System.out.println("this is two handler");
		RedirectView rv =new RedirectView();
		rv.setUrl(query);
		return rv;
	}
}
