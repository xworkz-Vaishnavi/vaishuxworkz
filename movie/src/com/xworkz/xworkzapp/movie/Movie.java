package com.xworkz.xworkzapp.movie;

public class Movie {

	public String director;
	public String producer;
	public String cast;
	
	
	public Movie(String director, String producer, String cast) 
	{
		this.director = director;
		this.producer = producer;
		this.cast = cast;
	}
	 
	public void entertainment() 
	{
		System.out.println("Enjoying the movie");
	}

}
