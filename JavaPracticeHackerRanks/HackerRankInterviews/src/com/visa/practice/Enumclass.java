package com.visa.practice;

import java.util.Arrays;

public class Enumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //String color = "blue";
	    String color = "pink";
	    //String color = "white";
	    
		Enumclass obj = new Enumclass();
		obj.method(color);
			
	}
	
	public enum Color{
		red,black,white
	}
	
	public boolean method (String color) {
		boolean b = Arrays.stream(Color.values())
				.anyMatch((c)->c.name().equals(color));
		System.out.println(b);
		return b;
	}
	
}
