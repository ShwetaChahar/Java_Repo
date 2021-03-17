package org.apex.exercise;


public class MissingNum {
	static int missingnum(int a[], int n) {
		int exptotal = n * (n + 1) / 2;
		int acttotal = 0;

		for (int i = 0; i < n; i++) {
			acttotal = acttotal + a[i];

		}
		return exptotal - acttotal;
	}

	public static void main(String[] args) {
		int A[] = { 1, 3, 2, 0, 6, 5, 7, 9, 8 };
		int n = 9;
		missingnum(A, n);
		
		System.out.println("Missing number in array " + missingnum(A, n));

	}
}
