package com.Springaop.service;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int x) {
		// TODO Auto-generated method stub
		System.out.println(x+"amount creadited");
		
		System.out.println(x+"amount debited");
	}

}
