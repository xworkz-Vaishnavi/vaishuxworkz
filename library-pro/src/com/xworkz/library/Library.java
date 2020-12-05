package com.xworkz.library;

public class Library {

	public String name;
	public String[] authorBySection;
	public String type;
	
	public Library(String name, String[] sectionsByAuthor, String type){
		
		this.name=name;
		this.authorBySection=sectionsByAuthor;
		this.type=type;
		
	}
}
