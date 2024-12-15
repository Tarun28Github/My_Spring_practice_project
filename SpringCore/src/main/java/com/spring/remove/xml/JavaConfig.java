package com.spring.remove.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa s =new Samosa();
		return s;
	}
	
	@Bean(name = "dem")
	public Demo getDemo() {
		
		Demo demo = new Demo(getSamosa());
		return demo;
	}	

}
