package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.city.CityWard;
import com.xworkz.xworkzapp.constants.WardName;
import com.xworkz.xworkzapp.dto.CityWardDTO;

public class CityWardUtil {

	
	public static void main(String[] args) {
		
		CityWard cw = new CityWard();
		
		CityWardDTO city = new CityWardDTO();
		city.setWardName(WardName.BASAVESHWARANAGAR);
		city.setWardNumber(3);
		city.setPopulation(6000);
		city.setCorporatorName("Ramesh");
		city.setAreaSqKilometers("27 kilometers");
		
		CityWardDTO city1 = new CityWardDTO();
		city1.setWardName(WardName.GANDHINAGAR);
		city1.setWardNumber(4);
		city1.setPopulation(7000);
		city1.setCorporatorName("Nagraju");
		city1.setAreaSqKilometers("20 kilometers");
		
		
		
		cw.addCityWardDetails(city);
		cw.addCityWardDetails(city1);
		cw.showAllWardDetails();
		cw.searchCityByWardNumber(3);
		cw.returnCorporatorByWardNumber(4);
		
			
	}
}
