package com.apex.problems.practice;

import java.util.ArrayList;

public class MatrixPossiblePaths {
	public static void main(String[] args) {
		// Given a matrix find 1 or more path from top left to bottom right.
//		 Index [0][0] to [3][3]
//
//				 [
//				  [ 1, -1, 1, -1 ],
//				  [ 1, 1, 1, -1 ],
//				  [ 1, -1, 1 , -1],
//				  [ 1, -1, 1, 1 ]
//				 ]

		MatrixPossiblePaths m = new MatrixPossiblePaths();
		int A[][] = m.ARR;
		int c = A[0].length;
		int r = A.length;
		ArrayList<Integer> path = new ArrayList<Integer>();
		m.printPath(0, 0, r-1, c-1, path);

      
	}

	int ARR[][] = { { 1, 4, 5 },
		      { 11, 6, 2 },
		      { 9,  7, 3 } };

	public void printPath(int rs, int cs, int re, int ce, ArrayList<Integer> path) {
		path.add(ARR[rs][cs]);
		if (rs == re && cs == ce) {
			System.out.println(path);
			return;
		}
		if (cs+1<=ce)
			printPath(rs, cs+1, re, ce, path);
		if (rs+1<=re)
			printPath(rs+1, cs, re, ce, path);
		path.remove(path.size()-1);
	}
	



}
