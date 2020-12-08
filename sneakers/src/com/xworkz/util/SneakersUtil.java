package com.xworkz.util;

import com.xworkz.sneakers.Sneakers;

public class SneakersUtil {

	public static void main(String[] args) {
		
		Sneakers sneakers = new Sneakers();
		sneakers.setColour("White");
		sneakers.setBrandName("Puma");
		sneakers.setPrice(1200);
		
		System.out.println(sneakers.getColour()+" "+sneakers.getBrandName()+" "+sneakers.getPrice());
	}
}
