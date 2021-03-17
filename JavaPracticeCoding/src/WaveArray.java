package com.apex.problems.practice;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {1,5,22,6,4,3,7,2,8,9} ;
		 //expected output {1,5,4,22,6,8,3,9,1,2}
		//assume even as small and odd as big ..big ,small,big small
		createwaveBigoddSmalleven(arr);
		//System.out.println(arr);
		for (int i: arr )
			System.out.print(i+" ");

	}

	private static void createwaveBigoddSmalleven(int[] arr) {
		
		for(int i=1; i<arr.length; i+=2) {
			if(arr[i-1]<arr[i]) swap(arr, i-1, i);   //5>1 ..swap 5,1 if odd(index) is less then even
			if(i<(arr.length-1) && (arr[i+1]<arr[i])) swap(arr,i+1,i);  //
		}
	   
	}

	private static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=  temp;
		
		
	}

}
