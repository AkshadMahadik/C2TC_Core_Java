package com.java.day.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareableExecutable {
	public static void main(String args[]) {
		
		List<Employee> emps= new ArrayList<Employee>();
		emps.add(new Employee("Sam",101,100000.0));
		emps.add(new Employee("Ram",105,100000.0));
		emps.add(new Employee("Lam",103,100000.0));
		emps.add(new Employee("Kam",108,100000.0));
		emps.add(new Employee("Fam",108,100000.0));
		emps.add(new Employee("Aam",107,100000.0));
		
		emps.forEach(System.out::println);
		Collections.sort(emps);
		System.out.println("*****************");
		System.out.println("Sorted Employee list is as follow");
		emps.forEach(System.out::println);
		
	}
}
