package org.apex.exercise;

public class Singletonexample {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getinstance(); 
		Singleton s2 = Singleton.getinstance(); 
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}

}
