package com.visa.practice;

import java.util.Arrays;

public class StringMultiply {

	public static void main(String[] args) {
		String a = "20";
		String b = "12";
		
		StringMultiply obj = new StringMultiply();
		System.out.println(obj.multi(a, b));
	}
	public String multi(String a, String b) {
		if (a.isEmpty() || b.isEmpty()) {
			System.out.println("String is  empty");
		}
		if (a == " " || b == " ") {
			System.out.println("String is null");
		}
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		int n1 = ch1.length;
		int n2 = ch2.length;
		char[] res = new char[n1 + n2];
		Arrays.fill(res, '0');
		for (int j = n2 - 1; j >= 0; j--) {
			for (int i = n1 - 1; i >= 0; i--) {
				// char to int,
				int product = (ch1[i] - '0') * (ch2[j] - '0');

				// we need temp sum because
				// may be they already have some value in the result
				int temp = res[i + j + 1] - '0' + product;

				// cast char, res: i + j + 1 % 10
				res[i + j + 1] = (char) (temp % 10 + '0');

				// i + j, ( to put carry to the previous position)
				res[i + j] = (char) (res[i + j] - '0' + temp / 10 + '0');
			}
		}
		StringBuilder sb = new StringBuilder();
		boolean seen = false;
		for (char c : res) {
			if (c == '0' && !seen)
				continue;
			sb.append(c);
			seen = true;
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}

}
