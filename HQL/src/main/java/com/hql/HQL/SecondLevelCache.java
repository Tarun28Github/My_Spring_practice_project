package com.hql.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SecondLevelCache {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s1 = factory.openSession();
		Student st = s1.get(Student.class,34);
		System.out.println(st.getName()+" : "+st.getId());
		
		s1.close();
		
		Session s2 = factory.openSession();
		Student st1 = s2.get(Student.class,34);
		System.out.println(st1.getName()+" : "+st1.getId());
		s2.close();
		
		factory.close();
	 
	}

}
