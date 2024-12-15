package com.hql.HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    
      SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     //creating object
      
     Session session = factory.openSession();
      
      Transaction tx = session.beginTransaction();
      
      Friends f = new Friends();
      f.setId(1);
      f.setName("Tomar Tarun Singh");
      f.setRollno(100);
      f.setCity("jaipur");
      
      Friends f1 = new Friends();
      f1.setId(2);
      f1.setName("Pradeep prajapati");
      f1.setRollno(101);
      f1.setCity("jaipur");
      
      Friends f2 = new Friends();
      f2.setId(3);
      f2.setName("Gopal borana");
      f2.setRollno(102);
      f2.setCity("Gujarat");
      
     
      
      session.save(f);
      session.save(f1);
      session.save(f2);
      
      tx.commit();
       
      session.close();
      factory.close(); 
    }
}
