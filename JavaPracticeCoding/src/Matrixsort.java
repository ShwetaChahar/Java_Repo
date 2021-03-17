package org.apex.exercise;

import java.util.Arrays;

public class Matrixsort {

	public static void main(String[] args) {
		// Input : matrix
		int mat[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };
		sortmatrix(mat);
//Output : {{1 2 3}
//          {4 5 6}
		// {7 8 9}

	}

	public static int[][] sortmatrix(int mat[][]) {

		int n = mat.length;
		int m = mat[0].length;
		int temp[] = new int[n * m];
		int count = 0;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				temp[count++] = mat[r][c];
			}

		}
		Arrays.sort(temp);
		count=0;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				mat[r][c] = temp[count++];
			}
		}
		// print matric output
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++)
				System.out.print(mat[r][c] + " ");
			System.out.println();
		}
		return mat;

	}

}
