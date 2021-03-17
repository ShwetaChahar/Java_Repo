package com.visa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramGroup {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Rat");
		words.add("Car");
		words.add("Below");
		words.add("Tast");
		words.add("Cried");
		words.add("Study");
		words.add("Thing");
		words.add("Chin");
		words.add("Grab");
		words.add("Act");
		words.add("Robed");
		words.add("Vase");
		words.add("Glean");
		words.add("Desserts");
		words.add("Tar");
		words.add("Arc");
		words.add("Elbow");
		words.add("State");
		words.add("Cider");
		words.add("Dusty");
		words.add("Night");
		words.add("Inch");
		words.add("Brag");
		words.add("Cat");
		words.add("Bored");
		words.add("Save");
		words.add("Angel");
		words.add("Streseed");
		

		// Group the Anagrams together:
		AnagramGroup obj = new AnagramGroup();
		int n = words.size();
		obj.checkEachElement(words, n);

	}

	public void checkEachElement(List<String> words, int n) {
		String[] arr =  words.toArray(new String[0]);
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (checkAnagram(arr[i], arr[j]))
					System.out.println(arr[i] + "," + arr[j]);
	}

	public boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			s1 = s1.toLowerCase();
			s2=s2.toLowerCase();
			String ss1 = sortString(s1);
			String ss2 =sortString(s2);
			return (ss1.equals(ss2));
				
		}
	}

	private String sortString(String s1) {
		char[] s1arr = s1.toCharArray();
		Arrays.sort(s1arr);
		return new String(s1arr);
	}

}
