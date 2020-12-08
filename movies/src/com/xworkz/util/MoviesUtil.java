package com.xworkz.util;

import com.xworkz.movies.Movies;

public class MoviesUtil {

	public static void main(String[] args) {
		
		Movies movies = new Movies();
		movies.setName("Gravity");
		movies.setLang("English");
		movies.setRatings(9);
		movies.setReviews("Good");
		
		System.out.println(movies.getName()+" "+movies.getLang()+" "+movies.getRatings()+" "+movies.getReviews());
	}
}
