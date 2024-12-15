package com.hql.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PaginationExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s = factory.openSession();
		
		Query q = s.createQuery("from Cources");
		
		//implementing pagination to implement it we need more data
		//in cources data is more compare to other thats why it take this
		
		q.setFirstResult(0);
		
		q.setMaxResults(5);
		
		List<Cources> list = q.list();
		
		for(Cources c : list) {
			System.out.println(c.getCource_name()+" : "+c.getId());
		}
		
	
		
		s.close();
		factory.close();
	}
}
