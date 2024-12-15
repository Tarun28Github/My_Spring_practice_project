package com.hql.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InnerJoinEx {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession(); 
		// since here we are fetching data using join we not need to commit trancaction;
		
		Query q = session.createQuery("select s.id, s.name , c.cource_name from Student as s INNER JOIN s.list as c");
		
		List<Object []> list = q.getResultList();
		
		for(Object[] arr: list ) {
			System.out.println(Arrays.toString(arr));
		}
		session.close();
		
		factory.close();
	}

}
