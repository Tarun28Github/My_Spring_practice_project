package com.spring.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext  context= new ClassPathXmlApplicationContext("com/spring/spEL/spconfig.xml");
		Demo d = context.getBean("demo",Demo.class);
		System.out.println(d);
	}

}
