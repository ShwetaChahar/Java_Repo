package org.apex.exercise;

public class Anagrm {

	public static void main(String[] args) {

		String str1="aha", str2="ahh";
		int flag=0;
		if(str1.length()!=str2.length()) {
			System.out.println(false);				
		}
		else {
			for(int i=0;i< str1.length();i++) {
				if (str2.contains(""+str1.charAt(i))) {
					flag=0;
				}else {
					flag=1;
					break;
				}
			}
			for(int i=0;i< str2.length();i++) {
				if (str1.contains(""+str2.charAt(i))) {
					flag=0;
				}else {
					flag=1;
					break;
				}
			}
		}
		if (flag==0){
			System.out.println("the strings are anagrams");
		}else
			System.out.println("The Strings are different");
		
			
	}
		

}

