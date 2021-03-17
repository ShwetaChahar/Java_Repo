package com.apex.problems.practice;

import java.util.Arrays;

public class AreAnagram {

	public static void main(String[] args) {
		String s1 = "my name is shetaw";
		String s2 = "My amen isshweta ";

		//IsAnagramOrNot(s1,s2);
		
		//IsAnagramOrNot(s1sorted,s2sorted);
		System.out.println(IsAnagramOrNot(s1,s2));
		System.out.println(s1+","+s2);

	}

	public static char[] convertToSorted(String s) {
		char sarray[] = s.toCharArray();
		Arrays.sort(sarray);
		return sarray;
	}
	
	private static boolean IsAnagramOrNot(String s1, String s2) {
		s1 = new String(convertToSorted(s1.toLowerCase()));
		s2 = new String(convertToSorted(s2.toLowerCase()));
//		System.out.println(s1sorted);
//		System.out.println(s2sorted);
		return (s1.equalsIgnoreCase(s2));
	}

}
