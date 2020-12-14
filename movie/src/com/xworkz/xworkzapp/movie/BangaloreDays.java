package com.xworkz.xworkzapp.movie;

public class BangaloreDays extends Movie {

	public BangaloreDays(String director, String producer, String cast)
	{
		super(director, producer, cast);
	}
	
	public void enjoy(String cast)
	{
		System.out.println("Entering into theatre with excitement");
		super.cast=cast;
		super.entertainment();
		System.out.println("coming outside theatre with relaxation");
	}
	
	{
		String director="S S Rajamouli";
		String cast="Prabhas";
		super.director=director;
		super.cast=cast;
		System.out.println(cast);
	}
}
