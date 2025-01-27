package com.Springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.Springaop.service.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
	  System.out.println("payment started");	
	}
	
	@After("execution(* com.Springaop.service.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
	  System.out.println("payment done");	
	  
	}
}
