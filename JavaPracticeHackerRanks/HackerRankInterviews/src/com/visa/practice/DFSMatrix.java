package com.visa.practice;

public class DFSMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 0, 1, 1, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 1, 1, 0 },
				{ 0, 1, 1, 0, 0, 0, 1 } };

		System.out.println("No of Island: " + countIsland(arr));
	}

	public static void dfs(int[][] arr, int r, int c) {
		/* look all 4 sides */
		if (arr[r][c] == 0)
			return;

		arr[r][c] = 0;
		if (r - 1 > -1)
			dfs(arr, r - 1, c);
		if (c - 1 > -1)
			dfs(arr, r, c - 1);
		if (c + 1 < arr[0].length)
			dfs(arr, r, c + 1);
		if (r + 1 < arr.length)
			dfs(arr, r + 1, c);
	}

	public static int countIsland(int[][] arr) {

		int island = 0;
		for (int r = 0; r < arr.length; ++r) {
			for (int c = 0; c < arr[0].length; ++c) {
				if (arr[r][c] == 1) {
					++island;
					dfs(arr, r, c);
				}
			}
		}
		return island;
	}

}
