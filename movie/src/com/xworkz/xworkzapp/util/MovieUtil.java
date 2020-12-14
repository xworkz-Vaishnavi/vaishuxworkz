package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.movie.BangaloreDays;

public class MovieUtil {

	public static void main(String[] args) {
		
		BangaloreDays days = new BangaloreDays("Anjali Menon","Anwar Rasheed","Dulquer Salman");
		System.out.println(days.director+" "+days.producer+" "+days.cast);
		days.enjoy("Dulquer Salman");
	}
}
