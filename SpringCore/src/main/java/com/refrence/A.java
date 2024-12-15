package com.refrence;

public class A {
	
	private int id;
	private String name;
	private B b;
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
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public A(int id, String name, B b) {
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	
	

}
