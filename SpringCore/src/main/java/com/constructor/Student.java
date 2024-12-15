package com.constructor;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private List<String> list;
	private Certi certi;
	

	


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + ", certi=" + certi + "]";
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, List<String> list, Certi certi) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.certi = certi;
	}}
