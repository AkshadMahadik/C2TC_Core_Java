package com.assignments.java;

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to MyBank Interface");
		System.out.println("Select the Choice of action you wish to use");
		int choice = sc.nextInt();
		while(choice!=0) {
			if(choice==1) {
				System.out.println("Transfer");
			}
			if(choice==2) {
				System.out.println("Deposit");
			}
			if(choice==3) {
				System.out.println("Withdraw");
			}
			if(choice==4) {
				System.out.println("Check Info");
			}
			if(choice==1) {
				System.out.println("!@#$%^&*()");
			}
		}
		
		sc.close();
	}

}
