package com.apex.problems.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i =0; int j =1;int k = 1;
		int n = 5;
		System.out.print("0 1 "); 
//		while(i<=n) {
//			k = i + j ;
//			
//			System.out.print(k+" "); 
//			i=j;
//			j=k;
//			//System.out.print(i+" "); 
//		}
		//System.out.print(i+" "); 0,1,1,2,3,5
		
		for(int c=2;c<n;c++) {
			k = i+j;
			System.out.print(k+" "); 
			i=j;
			j=k;
		}
		
	}
	}