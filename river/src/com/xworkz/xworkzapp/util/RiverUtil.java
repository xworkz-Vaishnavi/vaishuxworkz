package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Ganga;
import com.xworkz.xworkzapp.river.Kaveri;
import com.xworkz.xworkzapp.river.Yamuna;
public class RiverUtil {

	public static void main(String[] args) {
		
		Ganga ganga = new Ganga();
		ganga.setBirthplace("Gangotri");
		ganga.setRivertype("long");
		ganga.setEndplace("BayofBengal");
		
		System.out.println(ganga.getBirthplace()+" "+ganga.getRivertype()+" "+ganga.getEndplace());
		
		
		Kaveri kaveri = new Kaveri();
		kaveri.setBirthplace("Talakaveri");
		kaveri.setRivertype("long");
		kaveri.setEndplace("Bayofbengal");
		
		System.out.println(kaveri.getBirthplace()+" "+kaveri.getRivertype()+" "+kaveri.getEndplace());
		
		
		Yamuna yamuna = new Yamuna();
		yamuna.setBirthplace("himalayas");
		yamuna.setRivertype("medium");
		yamuna.setEndplace("kanyakumari");
		
		System.out.println(yamuna.getBirthplace()+" "+yamuna.getRivertype()+" "+yamuna.getEndplace());
	}
}
