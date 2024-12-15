package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo {

	public static void main(String[] args)
	{
		//creating session factory
		SessionFactory factory =  new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
//	   Student std = (Student)session.get(Student.class, 1);
//	   System.out.println(std);
//	   Student std1 = (Student)session.get(Student.class, 1);
//	
//	   System.out.println(std);
//	   
		
		Address ad = session.load(Address.class,2);
	
		
		
		
		session.close();
		factory.close();
	}
}
