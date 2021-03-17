package org.apex.exercise;

public class StringisImmutable {
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		System.out.println(s1);
		System.out.println(s1.concat("J2EE"));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.concat("Lang"));
		System.out.println(s2);
		print("s1", s1);
		print("s2", s2);

	}

	private static void print(String string, String object) {
		System.out.println(String.format("String:%s ,Hashcode %d ", string, object.hashCode()));

	}

}
