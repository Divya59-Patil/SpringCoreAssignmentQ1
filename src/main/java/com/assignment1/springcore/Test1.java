package com.assignment1.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Address address = context.getBean("Addobj",Address.class);
		address.dispalyAddress();
		
		Customer customer = context.getBean("CustObj",Customer.class);
		customer.displayCustomerInfo();
		
		context.close();
	}

}
