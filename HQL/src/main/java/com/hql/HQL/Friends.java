package com.hql.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friends {
	@Id
	private int id;
	private int rollno;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Friends(int id, int rollno, String name, String city) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
