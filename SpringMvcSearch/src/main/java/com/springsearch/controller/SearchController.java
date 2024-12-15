package com.springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/search")
	public String search() {		
		return "search";
	}
	
	@RequestMapping(path="/showsearch" , method=RequestMethod.POST)
	public RedirectView showSearch(@RequestParam("data") String data) {
		System.out.println(data);
		String query = "https://www.google.com/search?q="+data;
		RedirectView rv = new RedirectView();
		rv.setUrl(query);
		return rv;
	}
}
