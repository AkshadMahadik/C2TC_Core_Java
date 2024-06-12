package com.java.day.ComparableVsComparator;

import java.util.Comparator;



public class SalaryComparator implements Comparator<Employee>  {
	private String name;
	private int eid;
	private double salary;
	@Override
	public String toString() {
		return "SalaryComparator [name=" + name + ", eid=" + eid + ", salary=" + salary + ", getName()=" + getName()
				+ ", getEid()=" + getEid() + ", getSalary()=" + getSalary() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(),o2.getSalary());
	}

}
