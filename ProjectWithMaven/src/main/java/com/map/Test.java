package com.map;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String...args)
	{
	
		// creating session factory
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating object of question and answer
		
		Question q = new Question();
	    q.setId(1);
	    q.setQuestion("What is java?");
	    
	    Answer a = new Answer();
	    a.setId(101);
	    a.setAnswer("java is a programming language");
	    
	    
//	    Answer a1 = new Answer();
//	    a1.setId(102);
//	    a1.setAnswer("Is is an secure language");
//	    a1.setQuestion(q);
//	    
//	    Answer a2 = new Answer();
//	    a2.setAnswer("Java is platform indipendent");
//	    a2.setQuestion(q);
	    
//	    List<Answer> list = new ArrayList<Answer>();  
//	    list.add(a);
//	    list.add(a1);
//	    list.add(a2);
	    q.setAnswer(a);
	    
	    
		
		//opensession, begin transaction, save commit , close
		
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(q);
		session.save(a);
//		session.save(a1);
//		session.save(a2);
		
		//fetching data form question and data form answer through question
		
//		Question que = (Question) session.get(Question.class, 1);
	

		
		
		tx.commit();
		session.close();
		factory.close();
	}	
}
