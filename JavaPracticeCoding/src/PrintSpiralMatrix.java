package com.apex.problems.practice;

public class PrintSpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// >L
		// a[][] = T[ 6 6 7
		// 1 32 12
		// B 34 23 11]
		// <R
		// [6 6 7 12 11 23 34 1 32 ] top to bottom is rows changing ,left to right is columns changing

		int A[][] = { { 5, 4, 7, 11 }, 
				      { 1, 3, 8, 12 },
				      { 2, 9, 6, 33 }, 
				      { 12,19,16,13 }};
		int c = A[0].length;
		int r = A.length;

		printSpiral(A, c, r);

	}
	private static void printSpiral(int[][] A, int c, int r) {
		int T = 0;
		int B = r - 1;
		int L = 0;
		int R = c - 1;

		while (T <= B && L <= R) {
			for (int i = L; i <= R; i++)
				System.out.print(A[T][i] + ",");

			++T;
			for (int i = T; i <= B; i++)
				System.out.print(A[i][R] + ",");

			--R;
			for (int i = R; i >= L; --i)
				System.out.print(A[B][i] + ",");

			--B;
			for (int i = B; i >= T; --i)
				System.out.print(A[i][L] + ",");

			++L;
		}
	}

}
