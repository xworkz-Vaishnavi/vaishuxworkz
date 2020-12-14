package com.xworkz.xworkzapp.headphone;

public class Headphone {

	private String color;
	private double price;
	private String brandName = "Boat";
	
	
	public Headphone(double price)
	{
		this.price=price;
		System.out.println("arg 1 is: " + this.price);
	}
	
	
	private int maxVol = 6;
	private int minVol = 0;
	private boolean connected;
	private int currentVol;
	
	
	public void onOrOff() {
		if (this.isConnected() == false) {
			this.connected = true;
		} else if (isConnected() == true) {
			this.connected = false;
		}
	}
	
	
	
	public void increaseVolume() {
		System.out.println("inside increaseVolume()");
		if (connected == true) {
			if (this.currentVol < this.maxVol) {
				this.currentVol = currentVol + 1;
				System.out.println("current vol is :" + this.currentVol);
			} else {
				System.out.println("max vol reached");
			}
		} else {
			System.out.println("you fool max vol reached");
		}

	}
	
	
	public void decreaseVolume() {
		System.out.println("inside decreaseVolume()");
		if (connected == true) {
			if (this.currentVol > this.minVol) {
				this.currentVol = currentVol - 1;
				System.out.println("current vol is :" + this.currentVol);
			} else {
				System.out.println("min vol reached");
			}
		} else {
			System.out.println("you fool min vol reached");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public boolean isConnected() {
		return connected;
	}


	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
