package com.xworkz.util;

import com.xworkz.tablet.*;
public class TabletUtil {

	public static void main(String[] args) {
		
		Tablet tab = new Tablet();
		tab.name="Crocin";
		tab.noOfTablets=10;
		System.out.println(tab.name);
		System.out.println(tab.noOfTablets);
		tab.cure();
	}
}
