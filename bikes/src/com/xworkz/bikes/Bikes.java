package com.xworkz.bikes;

public class Bikes {
	
	private String brand;
	private double price;
	
	public Bikes(String brand, double price) {
		
		this.brand=brand;
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}

}
