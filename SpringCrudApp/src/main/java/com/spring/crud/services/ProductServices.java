package com.spring.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.ProductDaoImpl;
import com.spring.crud.entites.Product;

@Service
public class ProductServices {
	
	@Autowired
	private ProductDaoImpl productdaoimpl;
	
	public int insertProduct(Product product) {
		int i = this.productdaoimpl.saveProduct(product);
		
		return i;
	}
	
	public Product getProduct(int pid) {
		
		Product p = this.productdaoimpl.getProduct(pid);
		
		return p;	
	}
	
	public List<Product> getAllProducts(){
		List<Product> plist = this.productdaoimpl.getAllProduct();
		return plist;
	}
	
	public void deleteProduct(int pid) {
		this.productdaoimpl.deleteProduct(pid);
	}
	
	public void updateProduct(Product product) {
		
		this.productdaoimpl.UpdateProduct(product);
		
	}

}
