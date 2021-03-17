package com.apex.problems.practice;

import java.util.HashMap;

public class Interviewsecond {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(method(str));

	}

	public static char method(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		char res = '0';
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.get(c) == 1)
				res = c;
		}
		return res;
	}
}
