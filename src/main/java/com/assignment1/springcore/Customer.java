package com.assignment1.springcore;

//Create an Customer class with the following attributes:- customerId, customerName, 
//customerContact, customerAddress
public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	private String customerAddress;

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void displayCustomerInfo() {
		System.out.println("Customer info is : ");
		System.out.println("customer id is "+customerId+" customer Name is "+customerName+" customer contact is "
		+customerContact+" customer Address is "+customerAddress);
		
	}
}
