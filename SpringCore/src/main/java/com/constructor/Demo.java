package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/constructor/constconfig.xml");
		Student st = (Student)context.getBean("std");
		System.out.println(st);
		
	
		
	}
}
