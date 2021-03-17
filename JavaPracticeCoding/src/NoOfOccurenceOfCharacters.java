package org.apex.exercise;

import java.util.Scanner;

public class NoOfOccurenceOfCharacters { 
    static final int MAX_CHAR = 256; 
  
    static void getOccuringChar(String str) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR];
        boolean[] occured = new boolean[MAX_CHAR];
  
        int len = str.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
            occured[str.charAt(i)] = true;
        }
  
        for (int i = 0; i < len; i++)
        	if (occured[str.charAt(i)]) {
        		System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);
        		occured[str.charAt(i)] = false;
        	}
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);         // Taking input using scanner
		System.out.println("Enter any string : ");  
		String str = sc.nextLine();
		 getOccuringChar(str);
		
    } 
} 
