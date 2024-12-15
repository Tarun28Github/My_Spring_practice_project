package com.springsearch.entities;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private Long id;
	private Date date;
	private List<String> cources;
	private String type;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCources() {
		return cources;
	}
	public void setCources(List<String> cources) {
		this.cources = cources;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", cources=" + cources + ", type=" + type
				+ ", address=" + address + "]";
	}
	
	
}
