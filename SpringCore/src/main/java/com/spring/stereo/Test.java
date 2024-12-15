package com.spring.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereo/stereoconfig.xml");
		Student student = context.getBean("obj",Student.class);
		/* System.out.println(student); */
		System.out.println(student.hashCode());
		
		Student st2 = context.getBean("obj",Student.class);
		/* System.out.println(st2); */
		System.out.println(st2.hashCode());
	
	}

}
