package com.xworkz.util;

import com.xworkz.dress.Dress;

public class DressUtil {

	public static void main(String[] args) {
		
		Dress dress = new Dress();
		dress.setType("Jeans");
		dress.setPrice(1000);
		dress.setId("WES999");
		dress.setColour("Blue");
		dress.setBrand("Max");
		
		System.out.println(dress.getType()+" "+dress.getPrice()+" "+dress.getId()+" "+dress.getColour()+" "+dress.getBrand());
	}
}
