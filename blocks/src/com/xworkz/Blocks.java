package com.xworkz;

public class Blocks {
	
	int a;
	int b;
	int c;
	
	
	public static void main(String[] args) {
		
		Blocks block = new Blocks();
	    block.a=10;
	    block.b=20;
	    block.c=10+20;
	    System.out.println(block.a);
	    System.out.println(block.b);
	    System.out.println(block.c);
	    }
	static{
		System.out.println("Hiii Blocks");
	}
	static{
		System.out.println("c");
	}
	{
		System.out.println("c");
	}
	{
		System.out.println("c");
	}
	{
		System.out.println("c");
	}

}
