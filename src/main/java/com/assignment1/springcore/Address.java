package com.assignment1.springcore;

//Create an Address class with the following attributes:- street, city, state, zip, country
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String dispalyAddress() {
		System.out.println("Address is : ");
		System.out.println("street is "+street+" city is "+city+" state is "+state+" "
				+ "zip code is "+zip+" country is "+country);
		return "";
	}
}
