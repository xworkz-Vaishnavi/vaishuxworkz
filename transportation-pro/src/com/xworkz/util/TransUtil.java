 package com.xworkz.util;

import com.xworkz.transport.Transportation;

public class TransUtil {

	public static void main(String[] args) {
		
		
		Transportation trans =  new Transportation();
		         trans.id="LN12345RTY";
		         trans.name="VRL Logistics";
		         trans.noOfBranches=5;
		         trans.address[0]="Rajajinagar";
		         trans.address[1]="mgroad";
		         trans.address[2]="jaynagar";
		         trans.address[3]="magestic";
		         trans.address[4]="btm";
		         trans.address[5]="hebbal";
		         System.out.println(trans.id + " " + trans.name + " " + trans.noOfBranches);
		         trans.importAndExport();
		         trans.transport();
		         for(int i=0; i<(trans.address).length;i++) {
		        	 System.out.println(trans.address[i]);
		          
		        	 for(String address : trans.address) {
		        		 System.out.println(address);
		        	 }
		
	}
}
}