package org.apex.exercise;

public class Singleton {
	private static Singleton soleinstance = new Singleton();  //Sole instance created 
	private Singleton() {
		System.out.println("Creating...");
	}
	public static Singleton getinstance() {
		return soleinstance ;
		
	}
	

}
