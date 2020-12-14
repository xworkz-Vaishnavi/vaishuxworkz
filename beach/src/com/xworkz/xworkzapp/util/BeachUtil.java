package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.beach.Malpe;
public class BeachUtil {

	public static void main(String[] args) {
		
		Malpe malpe = new Malpe("udupi", 5, 56);
		System.out.println(malpe.noOfBoats+" "+malpe.noOfCafe+" "+malpe.place);
		malpe.enjoy(5);
	}
}
