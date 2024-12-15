package com.hql.HQL;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy ="student",cascade = CascadeType.ALL,orphanRemoval = true )
	private List<Cources> list = new ArrayList();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Cources> getList() {
		return list;
	}
	public void setList(List<Cources> list) {
		this.list = list;
	}
	public Student(int id, String name, List<Cources> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	public Student( String name, List<Cources> list) {
		super();
		
		this.name = name;
		this.list = list;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
