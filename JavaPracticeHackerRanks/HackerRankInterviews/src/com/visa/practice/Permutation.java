package com.visa.practice;

import java.util.HashSet;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation obj = new Permutation();
		obj.printPermutations("abc");
		System.out.println("Hello");
	}

	public void recPermutaion(String str, String rstr, HashSet<String> res) {
		if (str.equals("")) { //base condition for recursion
			System.out.println(rstr);
			res.add(rstr);
		}
		// System.out.printf("str:%s rstr=%s\n",str, rstr);
		for (int i = 0; i < str.length(); ++i) {
			String s = "" + str.substring(0, i) + str.substring(i + 1, str.length());
			String r = rstr + str.substring(i, i + 1);
			recPermutaion(s, r, res);
		}
	}
//since input is string we need to have wrapper method to pass input and store it in Hashset 
	public void printPermutations(String str) {
		String rstr = "";
		HashSet<String> res = new HashSet<String>();
		recPermutaion(str, rstr, res);
		System.out.println(res);
	}

}
