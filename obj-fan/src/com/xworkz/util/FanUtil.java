package com.xworkz.util;

import com.xworkz.fan.*;
public class FanUtil {

	
	public static void main(String[] args) {
		
		Fan fan = new Fan();
		fan.name="crompton";
		fan.size="5 inches";
		fan.price=5000;
		System.out.println(fan.name);
		System.out.println(fan.size);
		System.out.println(fan.price);
		fan.givesAir();
	}
}
