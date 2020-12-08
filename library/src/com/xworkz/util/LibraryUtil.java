package com.xworkz.util;

import com.xworkz.library.Library;

public class LibraryUtil {

	
	public static void main(String[] args) {
		
		Library lib = new Library("Governmentlibrary","Bangalore",5,45,"JayShetty");
		
		System.out.println(lib.getName()+" "+lib.getPlace()+" "+lib.getBlocks()+" "+lib.getId()+" "+lib.getAuthorName());
	}
}
