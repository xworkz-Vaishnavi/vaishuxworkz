package com.xworkz.pizzahut;

public class PizzaHut {
	
	//instance variables
	
public	String address;
public	String typeOfPizzas;
public	double price;
	

	public  PizzaHut()
	{
		this("jaynagar", "cornpizza");
		System.out.println("ending with zero param const");
	}
	
	
	
	public PizzaHut(String address , String typeOfPizzas)
	{
		System.out.println("inside two param const");
		this.address=address;
		this.typeOfPizzas=typeOfPizzas;
		System.out.println("ending with two param const");
		
	}
	
	public PizzaHut(double price)
	{
		this();
		System.out.println("inside one param const");
		System.out.println(this.price); 
		this.price=price;
	}
	

}
