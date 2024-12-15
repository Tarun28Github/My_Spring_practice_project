package com.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/refrence/refconfig.xml");
		A a = (A)context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getB().getId());
		
	}

}
