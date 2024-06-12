package com.java.day.inheritance;

public class Employee {
	private int E_id;
	private String Ename;
	private int Salary;
	
	
	public Employee(int e_id, String ename, int salary) {
		super();
		E_id = e_id;
		Ename = ename;
		Salary = salary;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}

	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", Ename=" + Ename + ", Salary=" + Salary + ", getE_id()=" + getE_id()
				+ ", getEname()=" + getEname() + ", getSalary()=" + getSalary() + "]";
	}
	
	

}
