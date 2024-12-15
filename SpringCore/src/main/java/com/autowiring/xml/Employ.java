package com.autowiring.xml;

public class Employ {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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
