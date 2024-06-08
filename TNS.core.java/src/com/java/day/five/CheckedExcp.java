package com.java.day.five;

import java.util.*;

public class CheckedExcp {
	public static void main(String[] args) throws Exception {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Age for Voting");
	int check = sc.nextInt();
	if (check>=18) {
		System.out.println("Machine is On Pls vote");
	}else
	{
		throw new Exception("Age is under 18 cant vote");
	}

	
	}
}
