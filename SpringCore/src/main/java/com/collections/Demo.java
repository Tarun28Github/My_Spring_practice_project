package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/collections/collectionconfig.xml");
		Test t = (Test)context.getBean("test");
		System.out.println(t);

	}
}
