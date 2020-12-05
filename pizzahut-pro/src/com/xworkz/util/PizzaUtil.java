package com.xworkz.util;
import java.util.Scanner;

import com.xworkz.pizzahut.PizzaHut;

public class PizzaUtil {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the address");
		String address=sc.next();
		System.out.println("Enter the type of pizzas");
		String typeOfPizzas=sc.next();
		System.out.println("Enter the price");
		// price=sc.nextDouble();
		sc.close();
		PizzaHut pizzahut = new PizzaHut(address,typeOfPizzas);
		System.out.println(pizzahut.address);
	}
}
