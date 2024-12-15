package com.springjdbc.SpringJDBC;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;


@Component("studentdaoimpl")
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemplate;
	

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    @Autowired
	public StudentDaoImpl(JdbcTemplate jdbctemplate) {
		super();
		this.jdbctemplate = jdbctemplate;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?);";
		int res = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());

		return res;
	}

	public int update(Student student) {
	    String query="update student set name=? , city=? where id=?";
	    int res = this.jdbctemplate.update(query, student.getName(),student.getCity(),student.getId());
		return res;
	}
 
	public int delete(int id) {
		String query ="delete from student where id=?";
		int res = this.jdbctemplate.update(query,id);
		return res;
	}

	public Student getStudent(int stid) {
        String  query="Select * from student where id =?;";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student st = this.jdbctemplate.queryForObject(query,rowMapper,stid);
		return st;
	}

	public List<Student> getAllStudents() {
        String query ="Select * from student;";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> stl = this.jdbctemplate.query(query, rowMapper);
 		return stl;
	}

}
