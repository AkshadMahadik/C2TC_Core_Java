package com.java.day.ExceptionHandling;

public class Excp {

	public static void main(String[] args) {
	
				int arr[];
				try {
					arr=new int[] {55,32,12,123,443,342};
					System.out.println(arr[10]);
				}
				catch(ArrayIndexOutOfBoundsException a) {
					System.err.println(a.getMessage());
					System.err.println("Array out of bound pls check ");
					
				}
				
			}

		}



