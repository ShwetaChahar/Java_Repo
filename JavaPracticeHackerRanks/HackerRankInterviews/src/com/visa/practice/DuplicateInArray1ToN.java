package com.visa.practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray1ToN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateInArray1ToN obj = new DuplicateInArray1ToN();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 6 };
		int n = arr.length;
		// System.out.print(obj.findduplicate(arr, n));
		// System.out.print(obj.findduplicatemethod1(arr));
		System.out.print(obj.findDupeasymethod2(arr));
		
	}

	public int findDupeasymethod2(int[] arr) {
		int num = arr.length - 1;
		int idealsm = num * (num + 1) / 2; //ideal sum n(n+1)/2 formula
		// sum of all elements in array arr
		int sum = 0; // initialize sum
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		int dupnum = (sum - idealsm);
		return dupnum;

	}

	public List<Integer> findduplicatemethod1(int[] arr) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int v = Math.abs(arr[i]);
			// v is also like index
			// assign value at indexvalue to negative - marking its visited once
			arr[v] = -arr[v];
			if (arr[v] > 0) {
				// System.out.println("value visited twice");
				ls.add(v);
			}
		}
		return ls;
	}

	int findduplicate(int[] arr, int n) {

		if (n <= 1)
			return -1;

		int slow = arr[0];
		int fast = arr[arr[0]];
		while (fast != slow) {
			slow = arr[slow];

			fast = arr[arr[fast]];
		}
		fast = 0;
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}

}
