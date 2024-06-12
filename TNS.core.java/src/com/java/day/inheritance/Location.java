package com.java.day.inheritance;

public class Location {
	private String City;
	private String State;
	private Manager M;
	public Location(String city, String state, Manager m) {
		super();
		City = city;
		State = state;
		M = m;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Manager getM() {
		return M;
	}
	public void setM(Manager m) {
		M = m;
	}
	@Override
	public String toString() {
		return "Location [City=" + City + ", State=" + State + ", M=" + M + "]";
	}
	
	
}
