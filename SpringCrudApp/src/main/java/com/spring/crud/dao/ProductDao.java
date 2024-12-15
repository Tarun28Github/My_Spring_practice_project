package com.spring.crud.dao;

import java.util.List;

import com.spring.crud.entites.Product;

public interface ProductDao {
	
	public int saveProduct(Product product);
	
	public Product getProduct(int pid);
	
	public List<Product> getAllProduct();
	
	public void deleteProduct(int pid);
	
	public void UpdateProduct(Product product);

}
