package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employ {
	

	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Autowired
	public Employ(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employ [address=" + address + "]";
	}

	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
