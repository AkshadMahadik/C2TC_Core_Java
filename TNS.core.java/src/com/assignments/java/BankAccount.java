package com.assignments.java;

public class BankAccount {
	public class Bank {
	    // Static variable to keep track of the total number of bank accounts
	    private static int totalAccounts = 0;

	    // Constructor to increment the totalAccounts whenever a new Bank object is created
	    public Bank() {
	        totalAccounts++;
	    }

	    // Static method to return the current value of totalAccounts
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    // Main method to test the Bank class
	    public static void main(String[] args) {
	        // Creating multiple Bank objects
	        Bank bank1 = new Bank();
	        Bank bank2 = new Bank();
	        Bank bank3 = new Bank();

	        // Printing the total number of bank accounts
	        System.out.println("Total number of bank accounts: " + Bank.getTotalAccounts());
	    }
	}
}
