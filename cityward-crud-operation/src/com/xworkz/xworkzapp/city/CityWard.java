package com.xworkz.xworkzapp.city;

import com.xworkz.xworkzapp.dto.CityWardDTO;


public class CityWard {


public CityWardDTO[] citywardDTOs = new CityWardDTO[2];
	
	public int index;
	
	

	
	public void addCityWardDetails(CityWardDTO ward)
	{
			if(ward.getPopulation() != 0 && ward.getWardName() != null  && ward.getWardNumber()!=0) 
				{
					if(ward.getPopulation()>=5000) {
						System.out.println("city ward details are correct");
						citywardDTOs[index++]=ward;
							System.out.println("city ward details are added");
						}
						else {
							System.out.println("The population should be greater than 5000");
						}
					}
					else {
						System.out.println("The ward number, ward name, population cant be empty");
					}
			}
	
	
	public void showAllWardDetails() {
		for(int i=0;i<citywardDTOs.length;i++) {
			if(citywardDTOs[i]!=null)
			{
				System.out.println("showAll method started");
				System.out.println(citywardDTOs[i].getWardName()+" "+citywardDTOs[i].getWardNumber()+" "+citywardDTOs[i].getPopulation()+" "+citywardDTOs[i].getCorporatorName()+" "+citywardDTOs[i].getAreaSqKilometers());
				System.out.println("show all method ended");
	        }
		}
	}	
	
	public void searchCityByWardNumber(int wardNumber){
		for(int i=0;i<citywardDTOs.length;i++) {
			if(citywardDTOs!=null) {
			if(citywardDTOs[i].getWardName().equals(wardNumber)) {
				System.out.println("checking the starting point if it matches it will print as");
				System.out.println(citywardDTOs[i].getWardNumber()+" "+citywardDTOs[i].getWardNumber()+" "+citywardDTOs[i].getCorporatorName()+" "+citywardDTOs[i].getPopulation()+" "+citywardDTOs[i].getAreaSqKilometers());
			}
		}
	}
		
	}
	
	public CityWardDTO returnCorporatorByWardNumber(int wardNumber)
	{
		CityWardDTO dto=null;
		for(int i=0;i<citywardDTOs.length;i++) {
			if(citywardDTOs != null) {
				dto = citywardDTOs[i];
				if(citywardDTOs[i].getWardNumber()==wardNumber)
				{
					System.out.println(citywardDTOs[i].getCorporatorName());
				}
					
			}
		}
		return dto;
		
	}
	
	
}
