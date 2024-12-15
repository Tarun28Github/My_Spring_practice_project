package com.bean.lifecycle;

public class BeanLifeCycle {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("setting value ");
	}

	public BeanLifeCycle(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "BeanLifeCycle [price=" + price + "]";
	}

	public BeanLifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void iniit() {
		System.out.println("Inside init method");
	
	}
	
	public void roy() {
		System.out.println("inside destroy method");
	}

}
