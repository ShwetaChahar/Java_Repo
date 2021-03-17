package org.apex.exercise;

import java.util.HashSet;

public class TwoSum {
	public static void twosum(int arr[], int sum) {
		HashSet<Integer> s1 = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];

			if (s1.contains(temp)) {
				System.out.println("Number one = " + temp);
				System.out.println("Number two = " + arr[i]);
				System.out.println("Sum = " + sum);

			}
			s1.add(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int A[]= {1,4,5,6,7,8,12,90,2};
		int n = 9
				;
		twosum(A,n);

}
}
