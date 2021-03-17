package com.apex.problems.practice;

public class SumofEvenNum {

	public static void main(String[] args) {
		//calculate sum of all even numbers till nth.0,2,4,6,8=20
	
		  sum(98);
		  int n ;
		  System.out.print(sum(98));

	}

	private static int sum(int n) {
		int evenSum = 0;
		
		for(int i = 0;i<=n;i++) {
			if(i%2==0) {
				evenSum = evenSum +i;
				
			}
		}
		return evenSum;
	}
}
	


