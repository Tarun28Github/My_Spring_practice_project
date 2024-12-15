package com.spring.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{new java.lang.String('Tomar Tarun Singh')}")
	private String name;
	@Value("#{11+55}")
	private int x;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double y;
	@Value("#{7>5}")
	private boolean z;
	@Value("#{T(java.lang.Math).PI}")
	private double a;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean isZ() {
		return z;
	}

	public void setZ(boolean z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + "]";
	}

	
	

}
