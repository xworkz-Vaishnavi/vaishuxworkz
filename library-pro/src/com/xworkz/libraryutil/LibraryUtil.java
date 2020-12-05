package com.xworkz.libraryutil;

import com.xworkz.library.Library;
public class LibraryUtil {
	
	public static void main(String[] args) {
		
		String [] authorBySection = {"Abdul kalam","Jay shetty"};
		
		Library library = new Library("Gnanagangotri", authorBySection, "private");
		
		  for(String author : authorBySection){ 
			  System.out.println(author);
			  }
		 
		System.out.println(library.name +" "+ library.type);
	}

}
