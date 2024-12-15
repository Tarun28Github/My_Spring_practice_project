package com.tut.ProjectWithMaven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	@Id
	@Column(name="address_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(length = 100, name="STREET")
	private String street;
	
	@Column(length = 100, name="CITY")
	private String city;
	
	@Column(name="is_open")
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Lob
	private byte[] image;
	
	@Column(name="address_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Address(int addressId, String street, String city, boolean isopen, double x, byte[] image, Date date) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.image = image;
		this.date = date;
	}



	public int getAddressId() {
		return addressId;
	}



	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public boolean isIsopen() {
		return isopen;
	}



	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}



	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] data) {
		this.image = data;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}

	
	
	

}
