package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.Companies;

public class FlightBookingDTO {

	private String airplaneCode;
	private Companies companies;
	private String startingPoiont;
	private String destination;
	private int totalSeats;
	private Boolean domestic;
	private double bussinessClassPrice;
	private double economyClassPrice;
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}
	public Companies getCompany() {
		return companies;
	}
	public void setCompany(Companies indigo) {
		this.companies = indigo;
	}
	public String getStartingPoiont() {
		return startingPoiont;
	}
	public void setStartingPoiont(String startingPoiont) {
		this.startingPoiont = startingPoiont;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public Boolean getDomestic() {
		return domestic;
	}
	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}
	public double getBussinessClassPrice() {
		return bussinessClassPrice;
	}
	public void setBussinessClassPrice(double bussinessClassPrice) {
		this.bussinessClassPrice = bussinessClassPrice;
	}
	public double getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
}
