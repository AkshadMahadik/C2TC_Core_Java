package com.java.day.four;

public class Manager extends Employee {
	private int eid;
	private int Salary;
	private String Name;
	private int teamSize;
	private Employee E;
	public Manager(int Eid, int salary, String name, int teamSize, Employee e) {
		super(Eid,name,salary);
		eid = Eid;
		Name = name;
		this.teamSize = teamSize;
		E = e;
		Salary=salary;
	}
	public int geteid() {
		return eid;
	}
	public void seteid(int Eid) {
		eid = Eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public void setSalary(int salary) {
		this.teamSize = salary;
	}
	public Employee getE() {
		return E;
	}
	public void setE(Employee e) {
		E = e;
	}
	@Override
	public String toString() {
		return "Manager [eid=" + eid + ", Name=" + Name + ", teamSize=" + teamSize + ", E=" + E + "]";
	}
	

}
