package com.spring.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.crud.entites.Product;
import com.spring.crud.services.ProductServices;

@Controller
public class CrudAppController {
	
	@Autowired
	private ProductServices service;
	
	@RequestMapping("/home")
	public String ShowProducts(Model m) {		
		m.addAttribute("product",service.getAllProducts()); 
		return "home";
	}
	
	@RequestMapping(path="/addProduct")
	public String  addproduct(){
		return "add_product";
	}
	
	@RequestMapping(path="/showAddedProduct", method=RequestMethod.POST)
	public RedirectView showAddedProduct(@ModelAttribute Product product) {
		//adding product
		 int i = this.service.insertProduct(product); 
	    
	    //adding image
		
		RedirectView rv = new RedirectView();
		rv.setUrl("home");
		return rv;
	}
	
	@RequestMapping("/deleteProduct/{id}")
	public RedirectView deletProduct(@PathVariable("id") int pid,HttpServletRequest req) {
		
		
		this.service.deleteProduct(pid);
		
		RedirectView rv = new RedirectView();
	    rv.setUrl(req.getContextPath()+"home");
	    return rv;	
	}
	
    @RequestMapping(path="/editProduct")
	public String editProduct(HttpServletRequest req, Model m) {
		
    	int id = Integer.parseInt(req.getParameter("id"));
    	Product product =this.service.getProduct(id);
    	m.addAttribute(product);
    	return "updateproduct";
	}
	
    @RequestMapping(path="/addupdatedProduct" , method=RequestMethod.POST)
    public RedirectView addupdatedProduct(@ModelAttribute("product") Product product) {
        
    	System.out.println(product);
    	this.service.updateProduct(product);
    	
    	RedirectView rv = new RedirectView();
    	rv.setUrl("home");
    	return rv;	
    }
    
    
}
