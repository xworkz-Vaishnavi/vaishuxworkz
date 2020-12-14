package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;
public class IceCreamUtil {

	public static void main(String[] args) {
		
		ButterScotch butterscotch = new ButterScotch();
		butterscotch.setCost(45.00);
		butterscotch.setType("cone");
		System.out.println(butterscotch.getCost()+" "+butterscotch.getType());
		
	}
}
