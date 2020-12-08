package com.xworkz.util;

import com.xworkz.church.Church;

public class ChurchUtil {

	public static void main(String[] args) {
		
		Church church = new Church("philomenas","mysore",45);
		
		System.out.println(church.getName()+" "+church.getAddress()+" "+church.getNoOfFathers());
	}
}
