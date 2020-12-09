package com.xworkz.util;
import com.xworkz.country.India;
import com.xworkz.country.*;
public class CountryUtil {

	
	public static void main(String[] args) {
		
		India india = new India(); 
		 /** india.setNoOfStates(28); india.setNoOfLang(800);
		 * india.setCapital("New Delhi");
		 */
		 india.noOfStates=30; 
		 india.noOfLang=700; 
		 india.capital="New Delhi";
		
		System.out.println(india.noOfStates+" "+india.noOfLang+" "+india.capital);
		//System.out.println(india.getNoOfStates()+" "+india.getNoOfLang()+" "+india.getCapital());
	    
	}
}
