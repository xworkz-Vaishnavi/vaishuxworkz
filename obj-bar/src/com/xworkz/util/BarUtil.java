package com.xworkz.util;

public class BarUtil {

	public static void main(String[] args) {
		
		Bar bar = new Bar();
	       bar.name="Navrang Bar";
		   bar.address="Rajajinagar";
		   bar.noOfBrands=90;
		   System.out.println(bar.name);
		   System.out.println(bar.address);
		   System.out.println(bar.noOfBrands);
		   bar.makePeopleHappy();
		   bar.makeLifeWorse();
	}
}
