package com.apex.problems.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAminusB {

	public static void main(String[] args) {
		Integer[] a = {1,3,4,5,6,2,6,5,34,23};
		Integer[] b = {4,5,4,5,34,23};
		System.out.println(a.length);
		//expected a-b 
		finddiff(a, b);
	//	System.out.println(lhs.size());
		
		//lhs.toArray(a);
		//System.out.println(Arrays.asList(a));
		

	}

	private static void finddiff(Integer[] a, Integer[] b) {
		HashSet<Integer> hset= (HashSet<Integer>) Arrays.asList(b).stream()
		.collect(Collectors.toSet());
		//System.out.println(hset);
		
		List<Integer> lhs = Arrays.asList(a).stream()
		.filter(s -> !hset.contains(s) )
		.collect(Collectors.toList());
		System.out.println(lhs);
	}

}
