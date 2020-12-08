package com.xworkz.airport;

public class Airport {

	private String place;
	private String planeName;
	private double noOfPassengers;
	
	public Airport(String place, String planeName, double noOfPassengers) {
		
		this.place=place;
		this.planeName=planeName;
		this.noOfPassengers=noOfPassengers;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place=place;
	}
	
	public String getPlaneName() {
		return planeName;
	}
	
	public void setPlaneName(String planeName) {
		this.planeName=planeName;
	}
	
	public double getNoOfPassengers() {
		return noOfPassengers;
	}
	
	public void setNoOfPassengers(double noOfPassengers) {
		this.noOfPassengers=noOfPassengers;
	}
}
