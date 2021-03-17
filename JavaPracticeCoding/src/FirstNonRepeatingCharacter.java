package org.apex.exercise;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "Karnataka";
		int l = str.length();
		
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < l; i++) {
			if (hmap.containsKey(str.charAt(i)))
				hmap.put(str.charAt(i), l);
			else
				hmap.put(str.charAt(i), i);
		}
		for(Map.Entry<Character, Integer> e : hmap.entrySet() ) {
			int min1 = l ;
			if (e.getValue() < min1 ) System.out.println(e.getKey());
			
		}

	}

}
