package com.xworkz.util;

import com.xworkz.apartments.Apartments;

public class ApartmentsUtil {

	public static void main(String[] args) {
		
		Apartments apart = new Apartments();
		apart.setName("Skandanshi");
		apart.setnoOfFloors(9);
		
		System.out.println(apart.getName()+" "+apart.getnoOfFloors());
	}
}
