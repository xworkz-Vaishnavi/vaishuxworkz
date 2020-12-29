package com.xworkz.xworkzapp.flight;

import com.xworkz.xworkzapp.dto.FlightBookingDTO;

public class Flight {

	public FlightBookingDTO[] flightDTOs = new FlightBookingDTO[2];
	
	public int index=0;
	
	

	
	public void addFlightBookingDetails(FlightBookingDTO flight)
	{
		System.out.println("Adding flight booking details");
	
			if(flight.getAirplaneCode()!=null && flight.getCompany()!=null && flight.getBussinessClassPrice()!=0 && flight.getStartingPoiont()!=null) 
				{
					if(flight.getBussinessClassPrice()>=1000) {
							flightDTOs[index]=flight;
							System.out.println("added flight "+flight.getCompany());
							index++;
						}
						else {
							System.out.println("Bussiness class price is less than 1000");
						}
					}
					else {
						System.out.println("Bussiness class price , air code, aircompany cant be empty");
					}
			}
	
	
	public void displayAllFlightDetails() {
		System.out.println("Displaying flight details");
		for(int i=0;i<flightDTOs.length;i++) {
			if(flightDTOs[i]!=null)
			{
				System.out.println("displaying all details");
				System.out.println(flightDTOs[i].getAirplaneCode()+" "+flightDTOs[i].getBussinessClassPrice()+" "+flightDTOs[i].getDestination()+" "+flightDTOs[i].getEconomyClassPrice()+" "+flightDTOs[i].getStartingPoiont()+" "+flightDTOs[i].getTotalSeats()+" "+flightDTOs[i].getCompany()+" "+flightDTOs[i].getDomestic());
			}
		}
	}	
	
	public FlightBookingDTO searchFlightByStartingPoint(String startingPoint){
		FlightBookingDTO fdto = null;
		System.out.println("Searching the starting point of" +startingPoint);
		for(int i=0;i<flightDTOs.length;i++) {
			if(flightDTOs[i]!=null) {
			if(flightDTOs[i].getStartingPoiont().equals(startingPoint)) {
				System.out.println("checking the starting point if it matches it will print as");
				System.out.println(flightDTOs[i].getAirplaneCode()+" "+flightDTOs[i].getBussinessClassPrice()+" "+flightDTOs[i].getCompany()+" "+flightDTOs[i].getDestination()+" "+flightDTOs[i].getDomestic()+" "+flightDTOs[i].getEconomyClassPrice()+" "+flightDTOs[i].getStartingPoiont()+" "+flightDTOs[i].getTotalSeats());
			}
		}
	}
		return fdto;
		
	}
	
}
