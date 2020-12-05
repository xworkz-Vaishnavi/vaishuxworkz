package com.xworkz;

public class StringUtil {
	
	public static void main(String[] args) {
		
		StringBuilder s5 = new StringBuilder("Aarti");
		 String s6 = ("Aarti");
		
		String s1 = "My name is vaishnavi H ";
		String s2 = "aarTI";
		
		String s3 = "aarTI";
		String s4 = "manjula";
		char ch = s1.charAt(3); 
		StringBuilder builder = new StringBuilder("Aarti");
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s2.contains(s3));
		System.out.println(s3.length());
		System.out.println(s1.trim());
		System.out.println(s5.reverse());
		System.out.println(s1.concat("vaish"));
		System.out.println(s6.matches("Aarti"));
		String[] finals1=s1.split(" ");
		for(String String : finals1) {
			
			System.out.println(String);
		}
	}

}
