package com.springcore;

public class Student {
	
	private int st_id;
	private String st_name;
	private String st_address;
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_address() {
		return st_address;
	}
	public void setSt_address(String st_address) {
		this.st_address = st_address;
	}
	public Student(int st_id, String st_name, String st_address) {
		super();
		this.st_id = st_id;
		this.st_name = st_name;
		this.st_address = st_address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [st_id=" + st_id + ", st_name=" + st_name + ", st_address=" + st_address + "]";
	}

	
}
