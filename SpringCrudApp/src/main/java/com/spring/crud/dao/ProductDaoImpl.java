package com.spring.crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.crud.entites.Product;

@Repository
public class ProductDaoImpl {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveProduct(Product product) {
		
		int i = (Integer) this.hibernateTemplate.save(product);
		
		return i;
	}

	public Product getProduct(int pid) {
		Product p = this.hibernateTemplate.get(Product.class, pid);
		return p;
	}

	public List<Product> getAllProduct() {

        List<Product> plist = this.hibernateTemplate.loadAll(Product.class);
		return plist;
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		
		Product p = this.hibernateTemplate.get(Product.class,pid);
		
		this.hibernateTemplate.delete(p);
		
	}

	@Transactional
	public void UpdateProduct(Product product) {
		this.hibernateTemplate.update(product);	
	}
	
}
