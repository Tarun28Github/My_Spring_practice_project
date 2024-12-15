package com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/annotation/autoConfig.xml");
		Employ emp = context.getBean("Emp",Employ.class);
		System.out.println(emp);
				
				
	}

}
