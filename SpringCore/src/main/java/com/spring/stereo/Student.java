package com.spring.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Student {
	@Value("Tarun")
	private String name;
	@Value("jaipur")
	private String city;
	@Value("#{list}")
	private List<String> list;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
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
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String city, List<String> list) {
		super();
		this.name = name;
		this.city = city;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", list=" + list + "]";
	}
	
	
	

}
