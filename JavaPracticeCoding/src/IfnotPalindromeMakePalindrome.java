package com.apex.problems.practice;

public class IfnotPalindromeMakePalindrome {

	public static void main(String[] args) {
		String s = "abeb";
		System.out.printf("%d\n", noOfAppends(s));

	}

	// Recursive function to count number of appends
	static int noOfAppends(String s) {
		if (isPalindrome(s.toCharArray()))
			return 0;

		// Removing first character of string by
		// incrementing base address pointer.
		s = s.substring(1);

		return 1 + noOfAppends(s);
	}

	static boolean isPalindrome(char[] str) {
		int len = str.length;

		// single character is always palindrome
		if (len == 1)
			return true;

		// pointing to first character
		char ptr1 = str[0];

		// pointing to last character
		char ptr2 = str[len - 1];

		while (ptr2 > ptr1) {
			if (ptr1 != ptr2)
				return false;
			ptr1++;
			ptr2--;
		}

		return true;
	}
}
