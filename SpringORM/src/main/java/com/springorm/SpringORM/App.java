package com.springorm.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.SpringORM.dao.StudentDao;
import com.springorm.SpringORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/SpringORM/Config.xml");
        StudentDao std = context.getBean("studentdao",StudentDao.class);
        
        // inserting student;
        
		/*
		 * Student st = new Student(102,"Pradeep prajapati","jodhpur");
		 * 
		 * int res = std.insert(st);
		 */
        
        //update student
        
		/*
		 * Student st = new Student(101,"Tomar Tarun Singh","gujarat"); std.update(st);
		 */
        // select single student
		/*
		 * Student st = std.getStudent(101); System.out.println(st);
		 */
        
        // select multiple student
		/*
		 * List<Student> stl = std.getAllStudent(); for(Student s : stl) {
		 * System.out.println(s); }
		 */
        
        //delete student
        
        std.delete(102);
        System.out.println("Student inserted success fully= ");
        
    }
}
