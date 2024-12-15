package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/standalone/aloneconfig.xml");
		Person person = context.getBean(Person.class,"person");
		System.out.println(person);
		
		
	}
}
