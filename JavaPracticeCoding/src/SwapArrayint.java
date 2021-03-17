package org.apex.exercise;

import java.util.Scanner;

public class SwapArrayint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the input array :");
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		swapintarray(n, arr);
		System.out.println("Print swapped array output");
		for (int j = 0; j < n; j++) {
			System.out.println(arr[j]);
		}

	}

	private static void swapintarray(int n, int[] arr) {
		int temp;
		int start = 0;
		int end = n - 1;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
