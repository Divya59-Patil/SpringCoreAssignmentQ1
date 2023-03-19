package com.test.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment1.springcore.Customer;

class CustomerTest {
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("We are design an program in which customer give there details");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("All details are prefectly submitted");
	}

	@Test
	public void testCustomer() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = (Customer) context.getBean("customer");

	}
}