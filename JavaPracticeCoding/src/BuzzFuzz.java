package com.apex.problems.practice;

public class BuzzFuzz {

	public static void main(String[] args) {
		// multiples of 3 Buzz multiples of 5 fuzz
		int n = 15;
		for (int i = 1; i <= n; i++) {
			if (i%15 == 0)
				System.out.print("BuzzFuzz"+" ");
			else if (i%3 == 0)
				System.out.print("Buzz"+" ");
			else if (i%5 == 0)
				System.out.print("Fuzz"+" ");
			else
				System.out.print(i+" ");
			//                    
			}

	}
}