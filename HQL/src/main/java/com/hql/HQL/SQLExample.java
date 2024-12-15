package com.hql.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		//creating sql query. createSqlQurey return nativeQuery
		
		NativeQuery qn = session.createSQLQuery("select * from student");
		
		// sql querys qn.list or resultList return an list of object array 
		List<Object[]> list = qn.list();
		
		for(Object[] arr: list) {
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		session.close();
		factory.close();
	}

}
