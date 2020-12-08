package com.xworkz.util;

import com.xworkz.phonepe.Phonepe;

public class PhonepeUtil {

	
	public static void main(String[] args) {
		
		Phonepe phone = new Phonepe("SBI41010","20184542562","4536725672672",678567);
		
		System.out.println(phone.getIfscCode()+" "+phone.getAddharNo()+" "+phone.getAccNo()+" "+phone.getPassword());
	}
}
