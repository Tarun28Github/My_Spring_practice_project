package com.tut.ProjectWithMaven;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demo {
	public static void main(String[] args)
	{
		
		// creating object of session Factory
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		// creating the object of Student class 
		
		Student st1 = new Student();
		
		st1.setRollno(101);
		st1.setName("Tomar Tarun Singh");
		st1.setCity("Jaipur");
		
		Certificate cer = new Certificate();
		cer.setCource("hibernate");
		cer.setDuration("5 months");
		
		st1.setCerti(cer);
		
		Student st2 = new Student();
		st2.setName("ravi teja");
		st2.setCity("gujarat");
		
		Certificate c2 = new Certificate();
		c2.setCource("java cource");
		c2.setDuration("3 months");
		
		st2.setCerti(c2);
		
		//open session, begin Transection , save object , commit, close
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st1);
		session.save(st2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
