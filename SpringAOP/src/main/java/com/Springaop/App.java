package com.Springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Springaop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/Springaop/Config.xml");
        
       PaymentService payment= context.getBean("payment",PaymentService.class);
       payment.makePayment(123);
    }
}
