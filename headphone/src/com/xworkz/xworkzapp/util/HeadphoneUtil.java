package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.headphone.*;
public class HeadphoneUtil {

	public static void main(String[] args) {
		
		Headphone headphone = new Headphone(1500);
		System.out.println(headphone.getBrandName());
		System.out.println(headphone.getColor());
		System.out.println(headphone.isConnected());
		
		headphone.increaseVolume();
		headphone.onOrOff();
		headphone.increaseVolume();
		headphone.increaseVolume();
		headphone.increaseVolume();
		headphone.increaseVolume();
		headphone.increaseVolume();
		headphone.increaseVolume();
		headphone.increaseVolume();
		headphone.decreaseVolume();
		headphone.decreaseVolume();
		headphone.decreaseVolume();
		headphone.decreaseVolume();
		headphone.decreaseVolume();
	}
}
