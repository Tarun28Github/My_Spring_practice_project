package com.hql.HQL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
@Entity
public class Cources {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cource_name;
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCource_name() {
		return cource_name;
	}
	public void setCource_name(String cource_name) {
		this.cource_name = cource_name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Cources(int id, String cource_name, Student student) {
		super();
		this.id = id;
		this.cource_name = cource_name;
		this.student = student;
	}
	public Cources( String cource_name, Student student) {
		super();
		this.cource_name = cource_name;
		this.student = student;
	}
	public Cources() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
