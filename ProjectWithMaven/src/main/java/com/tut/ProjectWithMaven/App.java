package com.tut.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        SessionFactory  factory = new Configuration().configure().buildSessionFactory();
        
       //creating Object of student
        
        Student st = new Student();
        
        st.setRollno(1);
        st.setName("Tomar Tarun Singh");
        st.setCity("Jaipur");
       
        
        //creating object of Address
        Address ad= new Address();
        ad.setAddressId(1);
        ad.setStreet("Shyam Vihar");
        ad.setCity("Girdharipura");
        ad.setIsopen(true);
        ad.setX(1220.654);
        ad.setDate(new Date());
        
        //reading image
       FileInputStream fis = new FileInputStream("src/main/java/image.jpg"); 
       byte[] data = new byte[fis.available()];
       fis.read(data);
       ad.setImage(data);
       
       //creating session
        
        Session session = factory.openSession();
        
        //beging Trasaction
        
       Transaction tx= session.beginTransaction();
        
        //save object
       
       session.save(st);
       session.save(ad);
       
       //commit 
       tx.commit();
       
       //close session
       session.close();
       
        
    }
}
