package com.visa.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumStrings {

	public static void main(String[] args) {
		String[] ls1 = { "1", "2", "9" };
		Integer[] ls2 = { 1, 2, 3 };
		SumStrings obj = new SumStrings();
//		int a = obj.method1(ls1);
//		System.out.println(a);
		obj.method2(ls2);
		Optional<Integer> b = obj.method2(ls2);
	}

	public Integer method1(String[] ls0) {
		List<String> ls = Arrays.asList(ls0);
		int sum = ls.stream()
				.map(s -> Integer.parseInt(s))
				.mapToInt(Integer::intValue)
				.sum();
		return sum;
	}

	public Optional<Integer> method2(Integer[] ls0) {
		List<Integer> ls = Arrays.asList(ls0);
		Optional<Integer> min = ls.stream()
				.mapToInt(Integer::intValue)
				min();
		System.out.println(min);
		return min;
	}

}
