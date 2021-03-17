package com.visa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramInList {

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
		GroupAnagramInList obj = new GroupAnagramInList();
		obj.printAnagram(words);
	}

	/* print Anagrams together from list of String */
	public void printAnagram(List<String> lstr) {
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		// Have structure where ur Key is String (after sort Anagram words would be
		// equal thus key "string 'key 'will override and values will add previous
		// plus new values List{Tac,Cat}

		for (String s : lstr) {
			String kstr = sortString(s);
			List<String> l = hm.getOrDefault(kstr, new ArrayList<String>());
			l.add(s);
			hm.put(kstr, l);
		}
		for (List<String> e : hm.values())
			if (e.size() > 1) {
				System.out.println(e);
			}

	}

	public boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {

			String ss1 = sortString(s1); // call method sortString
			String ss2 = sortString(s2);
			return (ss1.equals(ss2));
		}

	}

	/* Sort given string */
	public String sortString(String s) {
		s = s.toLowerCase();
		char[] sarr = s.toCharArray();
		Arrays.sort(sarr);

		// System.out.println(sarr);
		return new String(sarr);

	}

}
