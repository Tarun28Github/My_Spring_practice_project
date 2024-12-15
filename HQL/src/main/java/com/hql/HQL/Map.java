package com.hql.HQL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//creating objects;
		
//		Student st= new Student();
//		st.setName("Tarun");
//		Cources cst = new Cources("hindi",st);
//		Cources c2st = new Cources("Gujarati",st);
//		List<Cources> list = new ArrayList();
//		list.add(cst);
//		list.add(c2st);
//		st.setList(list);
//		
//		Student st1= new Student();
//		st1.setName("Gopal");
//        Cources cst1 = new Cources("hindi",st1);
//		Cources c1st1 = new Cources("gujarati",st1);
//		List<Cources> list1 = new ArrayList();
//		list1.add(cst1);
//		list1.add(c1st1);
//		st1.setList(list1);
//		
//		Student st2= new Student();
//		st2.setName("Himank");
//        Cources c1st2 = new Cources("gujarati",st2);
//		Cources c2st2 = new Cources("Gujarati",st2);
//		List<Cources> list2 = new ArrayList();
//		list2.add(c1st2);
//		list2.add(c2st2);
//		st2.setList(list2);
//		
//		Student st3= new Student();
//		st3.setName("pradeep");
//		Cources cst3 = new Cources("hindi",st3);
//		List<Cources> list3 = new ArrayList();
//		list3.add(cst3);
//		st3.setList(list3);
//				
//		
		
		Student st = new Student();
		st.setName("Ayush");
		
		Cources c1=new Cources("English",st);
		Cources c2 = new Cources("Science",st);
		List<Cources> list = new ArrayList();
		list.add(c1);
		list.add(c2);
		st.setList(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		session.save(st);
//		session.save(st1);
//		session.save(st2);
//		session.save(st3);
//		session.save(cst);
//		session.save(c2st);
//		session.save(cst1);
//		session.save(c1st1);
//		session.save(c1st2);
//		session.save(c2st2);
//		session.save(cst3);
		
		session.save(st);
		
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
}
