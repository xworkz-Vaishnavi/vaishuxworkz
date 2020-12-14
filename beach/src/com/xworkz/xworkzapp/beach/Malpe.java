package com.xworkz.xworkzapp.beach;

public class Malpe extends Beach {

	public Malpe(String place,int noOfCafe,int noOfBoats){
		super(place, noOfCafe, noOfBoats);
		super.noOfCafe=noOfCafe;
	}
	
	public void enjoy(int noOfCafe)
	{
		System.out.println("Entering inside enjoy method malpe");
		super.noOfCafe = noOfCafe;
		super.enjoyWithFriends();
		System.out.println("End of enjoy method of malpe");
	}
	
	
	  { 
		  int noOfCafe=56; String place="5 km from udupi";
		  super.noOfCafe=noOfCafe;
	      super.place=place; 
	      System.out.println(place);
	  }
	 
}
