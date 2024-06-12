package com.java.day.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExecuter {
public static void main(String args[]) {
		
		List<Employee> emps= new ArrayList<Employee>();
		emps.add(new Employee("Sam",101,10000.0));
		emps.add(new Employee("Ram",105,30000.0));
		emps.add(new Employee("Lam",103,40000.0));
		emps.add(new Employee("Kam",108,80000.0));
		emps.add(new Employee("Fam",108,50000.0));
		emps.add(new Employee("Aam",107,60000.0));
		
		emps.forEach(System.out::println);
		Collections.sort(emps,new SalaryComparator());
		System.out.println("*****************");
		System.out.println("Sorted Employee list is as follow");
		emps.forEach(System.out::println);
		
	}
}
