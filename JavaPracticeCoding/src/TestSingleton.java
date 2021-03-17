package org.apex.exercise;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		
	
		print("s1",s1);
		print("s2",s2);


	}

	private static void print(String name, Singleton object) {
	System.out.println(String.format("Object : %s,Hashcode : %d",name, object.hashCode()));
	
	}
	
}
