package com.java.day.three;

//Demo on "Has a " Relationship 
public class Execute {
	
	public static void main(String args[]) {
	Address A1 = new Address("Dadar","Dadar Station","Mumbai");
	
	Person p1 = new Person("Akshad","Mahadik",A1);
	
	System.out.println(p1);
	
	}
	
}
