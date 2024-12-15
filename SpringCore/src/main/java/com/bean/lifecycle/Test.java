package com.bean.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
          
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bean/lifecycle/beanConfig.xml");
		Example ex = (Example)context.getBean("ex");
		System.out.println(ex);
		context.registerShutdownHook();
				
	}

}
