package com.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
	public static void main(String[] args) {
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bean/lifecycle/beanConfig.xml");
            BeanLifeCycle cycle = (BeanLifeCycle) context.getBean("blc");
            System.out.println(cycle);
            context.registerShutdownHook();
	}
}
