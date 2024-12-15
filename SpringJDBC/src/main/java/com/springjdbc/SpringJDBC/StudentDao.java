package com.springjdbc.SpringJDBC;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student getStudent(int stid);
	public List<Student> getAllStudents();

}
