package com.xworkz.util;

import com.xworkz.bikes.Bikes;

public class BikesUtil {
	
	public static void main(String[] args) {
		
		Bikes bikes = new Bikes("Royal Enfield", 300000);
		
		System.out.println(bikes.getBrand()+" "+bikes.getPrice());
	}

}
