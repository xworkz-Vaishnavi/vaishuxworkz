package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.constants.Companies;
import com.xworkz.xworkzapp.dto.FlightBookingDTO;
import com.xworkz.xworkzapp.flight.Flight;

public class FlightBookingUtil {

	
	public static void main(String[] args) {
		
		Flight flight = new Flight();
		FlightBookingDTO fb = new FlightBookingDTO();
		
		fb.setAirplaneCode("A279");
		fb.setStartingPoiont("Bangalore");
		fb.setDestination("kolkata");
		fb.setDomestic(true);
		fb.setBussinessClassPrice(90000);
		fb.setCompany(Companies.INDIGO);
		fb.setEconomyClassPrice(1000.00);
		
		//flight.addFlightBookingDetails(fb);
		//System.out.println(fb.getAirplaneCode()+" "+fb.getStartingPoiont()+" "+fb.getDestination()+" "+fb.getDomestic()+" "+fb.getBussinessClassPrice()+" "+fb.getCompany()+" "+fb.getEconomyClassPrice());

		
		FlightBookingDTO fb1 = new FlightBookingDTO();
		fb1.setAirplaneCode("A972");
		fb1.setStartingPoiont("Manglore");
		fb1.setDestination("orissa");
		fb1.setDomestic(false);
		fb1.setBussinessClassPrice(8000);
		fb1.setCompany(Companies.AIRINDIA);
		fb1.setEconomyClassPrice(2000.00);
		
		flight.addFlightBookingDetails(fb);
		flight.addFlightBookingDetails(fb1);
		//System.out.println(""fb1.getAirplaneCode()+" "+fb1.getStartingPoiont()+" "+fb1.getDestination()+" "+fb1.getDomestic()+" "+fb1.getBussinessClassPrice()+" "+fb1.getCompany()+" "+fb1.getEconomyClassPrice());
		flight.displayAllFlightDetails();
		flight.searchFlightByStartingPoint("Bangalore");
		
	}
}
