package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.ProjectWithMaven.Student;

public class HQLExample {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s = factory.openSession();
		
		String query ="from Student";
		
		Query q =s.createQuery(query);
		//if getting single result - than use (q.unique)
		// if getting multiple result - (q.list)
		// here we get multiple result
		
		List<Student> list = q.list();
		
		for(Student std: list) {
			System.out.println(std.getName());
		}
		
		
		
		
		
		s.close();
		
		factory.close();
	}

}
