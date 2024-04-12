package com.java.day3;

public class Person {
	private String FirstName;
	private String LastName;
	private Address Address;
	

	public Person(String firstName, String lastName, Address address) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public com.java.day3.Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Person"+"\n"+"FirstName="+ FirstName + "\n"+"LastName=" + LastName +"\n"+ "Address=" + Address + "]";
	}
	
}
