package com.xworkz.util;

import com.xworkz.newspaper.TimesOfIndia;
import com.xworkz.newspaper.Newspaper;

public class NewspaperUtil {

	public static void main(String[] args) {
		
		Newspaper news = new Newspaper();
		news.setNoOfPages(20);
		news.setPrice(6);
		/*
		 * news.noOfPages=25; news.price=7;
		 * System.out.println(news.noOfPages+" "+news.price);
		 */
		System.out.println(news.getNoOfPages()+" "+news.getPrice());
	}
}
