package com.hql.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlExample {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session= factory.openSession();
		
		//creating query
		
		String query = "from Friends";
		
	    Query q = session.createQuery(query);
	    
	    // if result is single use - q.unique();
	    // if result is multiple use - q.list();
	    
	       List<Friends> list = q.list();
	       
	       for(Friends f: list) {
	    	   System.out.println(f.getId()+": "+f.getName()+": "+f.getCity()+": "+f.getRollno());
	       }
		System.out.println("__________________");
		Transaction tx = session.beginTransaction();
		
		//query for delete;
//	    Query q2 = session.createQuery("delete from Friends where id=:x");
//	    q2.setParameter("x", 0);
//	    
//	    int r = q2.executeUpdate();
//	    System.out.println("deleted"+": "+r);

		// query for update;
		
		Query q3 = session.createQuery("update Friends as f set f.city =:x where f.rollno=:y");
		q3.setParameter("x", "Jodhpur");
		q3.setParameter("y", 101);
		int r = q3.executeUpdate();
 	    System.out.println("updated"+": "+r);
		
		tx.commit();
		factory.close();
	}

}
