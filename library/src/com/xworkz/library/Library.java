package com.xworkz.library;

public class Library {
	
	private String name;
	private String place;
	private int blocks;
	private int id;
	private String authorName;
	
	public Library(String name, String place, int blocks, int id, String authorName) {
		
		this.name=name;
		this.place=place;
		this.blocks=blocks;
		this.id=id;
		this.authorName=authorName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place=place;
	}
	
	public int getBlocks() {
		return blocks;
	}
	
	public void setBlocks(int blocks) {
		this.blocks=blocks;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName=authorName;
	}
}
