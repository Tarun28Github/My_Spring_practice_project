package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
	
	public static void main(String...asf)
	{
		//creating sessionfactory
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating objects
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
	
		e1.setEid(1);
		e1.setEname("tarun");
		
		e2.setEid(2);
		e2.setEname("himank");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(101);
		p1.setPname("alpha");
		
		p2.setPid(102);
		p2.setPname("beta");
		
		List<Employee> elist = new ArrayList<Employee>();
		List<Project> plist = new ArrayList<Project>();
	  
		elist.add(e1);
		elist.add(e2);
		
		plist.add(p1);
		plist.add(p2);
		
		e1.setProject(plist);
		p1.setEmployee(elist);
		
		
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
