package org.apex.exercise;

import java.util.Scanner;

public class Noofcount {
private static final int MAX_CHAR = 0;

public static void main(String[] args)
{
	//String mystr = "Mary had a little lamb";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string : "); 
	String mystr = sc.nextLine();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the character : "); 
	
	char mychar = sc1.next().charAt(0); 
	
	
	//char mychar = 'h';
	int count = 0;
	
	{

		for (int i = 0; i < mystr.length(); i++) {
			if (mystr.charAt(i) == mychar) {
				count = count + 1;
				
			}
		}

		System.out.println("The number of time this character occurs: "+count);

	}
}


}
