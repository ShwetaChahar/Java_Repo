package com.visa.practice;

public class LongestFibonacciInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 7, 12, 13, 25, 52 };

		LongestFibonacciInArray obj = new LongestFibonacciInArray();
		System.out.println(obj.methodfindFibo(arr));

	}

	public int methodfindFibo(int[] arr) {
		int max = 0;
		int curmax = 0;
		for (int i = 2; i < arr.length; ++i) {
			if (arr[i] == arr[i - 1] + arr[i - 2])
				curmax++;
			else {
				max = Math.max(max, curmax);
				curmax = 0;
			}
		}
		if (max > 0)
			return (max + 2); //<<< since we started from index 2 
		else
			return 0;
	}

}
