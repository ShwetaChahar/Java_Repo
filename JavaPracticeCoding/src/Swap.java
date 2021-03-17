package org.apex.exercise;

import java.util.Scanner;

public class Swap 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter  size array : ");
		int n = in.nextInt();
//Declare array	
		String arr[] = new String[n];
		System.out.println("Enter array values :");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = in.nextLine();
		}
		swap(n, arr);
		System.out.println("Print swapped array ");
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.println(arr[j]);
			}
		}

	}

	private static void swap(int n, String[] arr) {
		String temp;
		int start = 0;
		int end = n - 1;
		while (start < end) 
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}
}