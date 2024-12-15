package com.springjdbc.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class App

{
	public static void main(String[] args) {
		System.out.println("MY Program started...");
		// fetch bean
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
//				ClassPathXmlApplicationContext("com/springjdbc/SpringJDBC/config.xml");
		StudentDao stdao = context.getBean("studentdaoimpl", StudentDaoImpl.class);
		// insert
//        Student st =new Student();
//        st.setId(102);
//        st.setName("pradeep");
//        st.setCity("jaipur");
//        
//        int res = stdao.insert(st); 

		// update
//        Student st = new Student(101,"Tomar Tarun","gujarat");
//        int res =stdao.update(st);

		// delete
//        int res= stdao.delete(102);

		// fetching single row from database
//        Student st = stdao.getStudent(101);  
		
		//fetchig multiple row from database
		List<Student> st = stdao.getAllStudents();
		
		for(Student s: st) {
			System.out.println(s);			
		}
		

	}
}
