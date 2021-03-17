package com.apex.problems.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestInList {

	public static void main(String[] args) {
		// List<Integer> ls

		List<Integer> ls = Arrays.asList(3, 6, 9, 8, 12, 14);
		Integer result = method(ls);
		System.out.println(result);

	}

	public static Integer method(List<Integer> ls) {

		if (ls.size() < 2) {
			System.out.println("No second number inside");
			return -1;

		}
		Integer f = 0;
		Integer s = 0;
		for (int i : ls) {

			if (i >= f) {

				s = f;
				f = i;
			} else if (i >= s)
				s = i;
		}
		return s;
	}

}
