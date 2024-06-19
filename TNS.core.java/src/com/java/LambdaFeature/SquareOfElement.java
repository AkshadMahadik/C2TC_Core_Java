package com.java.LambdaFeature;
import java.util.ArrayList;
import java.util.List;
public class SquareOfElement {
	public static void main(String args[]) {
		  List<Integer> num = new ArrayList<>();
		  num.add(10);
		  num.add(20);
		  num.add(30);
		  num.add(40);
		  num.add(50);
		  num.add(60);
		  num.add(70);
		  ArrayList<Integer> squares = new ArrayList<>();
		  for (int number : num) {
		    squares.add(number * number);
		  }
		  System.out.println("Original numbers: " + num);
		  System.out.println("Squared numbers: " + squares);
		}
}
