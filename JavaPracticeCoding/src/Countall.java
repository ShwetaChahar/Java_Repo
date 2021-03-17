package org.apex.exercise;

public class Countall {
	public static void main(String[] args) {

	 final int MAX_CHAR = 256;

	//static final int MAX_CHAR = 256; 
	
	{
		String mystr = "Marya";
		
		int  count[] = new int[MAX_CHAR];
		int lenstr = mystr.length();
		for (int i = 0; i< lenstr; i++) {
			count[mystr.charAt(i)]++;
		}
		System.out.println(count[mystr.charAt(lenstr)]);

	}

}
}
