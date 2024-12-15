package com.springorm.SpringORM.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.springorm.SpringORM.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
		
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

//  insert operation
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	//select operation 
	//selecting single student
	
	public Student getStudent(int studentid) {
		Student st = this.hibernateTemplate.get(Student.class, studentid);
		return st;
	}
	
	//selecting multiple student
	
	public List<Student> getAllStudent(){
		List<Student> stl = this.hibernateTemplate.loadAll(Student.class);		
		return stl;
	}
	
	//update operation
    @Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	//delete operation
    @Transactional
	public void delete(int studentid) {
    	Student st = this.hibernateTemplate.get(Student.class,studentid);
		this.hibernateTemplate.delete(st);
	}
}
