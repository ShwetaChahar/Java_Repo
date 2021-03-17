package com.apex.problems.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayOccurenceUniq {

	public static void main(String[] args) {
		int arr[] = { 11, 11, 11, 2, 2, 2, 2, 3, 3, 4 ,4};
		int l = arr.length;
		//
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		HashSet<Integer> hset = new HashSet<Integer>();

		arrayIntoHashmap(arr, l, hmap);
		System.out.println(hmap);

		occurenceCountIntoHashset(hmap, hset);
		System.out.println(hset);
		
		compareSizeHmapHset(hmap, hset);
	}

	private static void compareSizeHmapHset(HashMap<Integer, Integer> hmap, HashSet<Integer> hset) {
		if(hmap.size()== hset.size())
			System.out.println("Occurences are unique");
		else
			System.out.println("Occurences are Not unique");
	}

	private static void occurenceCountIntoHashset(HashMap<Integer, Integer> hmap, HashSet<Integer> hset) {
		for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
	//		System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
			hset.add(e.getValue());
			
		}
	}

	private static void arrayIntoHashmap(int[] arr, int l, HashMap<Integer, Integer> hmap) {
		for (int i = 0; i < l; i++) {
			if (hmap.containsKey(arr[i]))
				hmap.put(arr[i], (hmap.get(arr[i]) + 1));

			else
				hmap.put(arr[i], 1);
		}
	}

}
