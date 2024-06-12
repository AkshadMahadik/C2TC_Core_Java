package com.java.day.Constructor;

import java.util.Scanner;

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter City");
		String city = sc.next();
		
		Customer cl=new Customer(id,name,city);	
		System.out.println("Customer Details"+cl.toString());
		
		sc.close();
		
	}
}
