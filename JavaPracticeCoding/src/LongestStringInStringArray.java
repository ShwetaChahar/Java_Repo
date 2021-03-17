package org.apex.exercise;

public class LongestStringInStringArray {
	static String longeststring(String arr[]) {
		int maxl = 0;
		String strlong = null;
		for (String s : arr) {
			if (s.length() > maxl) {
				maxl = s.length();
				strlong = s;
			}
		}
		return strlong;
	}

	public static void main(String[] args) {
		String A[] = { "AA", "AB", "BA", "BB", "ADCF", "SDF","Iamlongest" };
		String strlong = longeststring(A);
		System.out.println(strlong);
	}
}