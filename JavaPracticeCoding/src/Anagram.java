package org.apex.exercise;

import java.util.HashMap;

public class Anagram {
	static boolean areanagram(String str1,String str2) {
	
	
	HashMap<Character,Integer> hmap1 = new HashMap<Character,Integer>();
	HashMap<Character,Integer> hmap2 = new HashMap<Character,Integer>();
	char arr1[] = str1.toCharArray();
	char arr2[] = str2.toCharArray();
	
	for (int i=0;i < arr1.length;i++) {
		if(hmap1.get(arr1[i])== null) {
			hmap1.put(arr1[i],1);
		}
	}
	for (int j=0;j < arr2.length;j++) {
		if(hmap2.get(arr2[j])== null) {
			hmap2.put(arr2[j],1);
		}
	}
	if (hmap1.equals(hmap2))
	return true;
	else
	return false;	

}
	public static void main(String[] args) {
		String str1 = "HA";
		String str2 = "AAH";
		System.out.println(areanagram(str1,str2));
		
	}
}
