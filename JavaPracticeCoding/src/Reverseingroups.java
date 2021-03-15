
public class Reverseingroups {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14 };
		int k = 2;
		int len = arr.length;
		revgrp(arr, k, len);
		for (int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
		// output expected {4,3,2,1,8,7,6,5,11,10,9}

	}

	static void revgrp(int[] arr, int k, int len) {
		for (int i = 0; i < len; i = i + k) {
			int left = i;
			// int right = i+k-1;
			int right = Math.min(i + k - 1, len - 1);
			while (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left = left + 1;
				right = right - 1;
			}

		}
	}

}
