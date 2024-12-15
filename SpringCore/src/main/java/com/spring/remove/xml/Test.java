package com.spring.remove.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		Demo d = context.getBean("dem",Demo.class);
		System.out.println(d);
		d.Study();
		d.getSamosa().display();
				
	}

}
