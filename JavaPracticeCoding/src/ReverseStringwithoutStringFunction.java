package com.apex.problems.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseStringwithoutStringFunction {

	public static void main(String[] args) {
		String s1 = "Shweta humbe I";

		s1 = differentReverse(s1);
		System.out.println("Output rev= " + s1);
		doReverse(s1);
	}

	private static String differentReverse(String s1) {
		List<String> lstr = Arrays.asList(s1.split(" "));
		Collections.reverse(lstr);
		s1 = String.join(" ", lstr);
		return s1;
	}

	private static void doReverse(String s1) {
		int i = 0;
		int j = s1.length() - 1;
		char sarr[] = s1.toCharArray();
		while (i < j) {
			char t = sarr[i];
			sarr[i] = sarr[j];
			sarr[j] = t;
			i++;
			j--;
		}
		// System.out.println(sarr);
		s1 = new String(sarr);
		// System.out.println(s1);
	}

}
