package com.xworkz.util;

import com.xworkz.airport.Airport;

public class AirportUtil {
	
	public static void main(String[] args) {
		
		Airport airport = new Airport("Bangalore","Indigo",500);
		
		System.out.println(airport.getPlace()+" "+airport.getPlaneName()+" "+airport.getNoOfPassengers());
	}

}
