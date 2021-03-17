package org.apex.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) throws IOException {
		// Create input stream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\chaha\\eclipse-workspace\\YntPractiveInterviews\\src\\org\\apex\\exercise\\xyzout.txt");
		PrintWriter pw= new PrintWriter(fos);
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\chaha\\eclipse-workspace\\YntPractiveInterviews\\src\\org\\apex\\exercise\\xyz.txt");
		Scanner fileinput = new Scanner(fin);
		// Create Array List
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		// Read thru file
		while (fileinput.hasNext()) {
			// get next word
			String nextword = fileinput.next();
			// determine if the word is in arraylist
			if (words.contains(nextword)) {
				int index = words.indexOf(nextword);
				count.set(index, count.get(index) + 1);
			} else {
				words.add(nextword);
				count.add(1);
			}
		}
//Close files
		fileinput.close();
		fin.close();
		
		
		// print out
		for (int i = 0; i < words.size(); i++) {
			//System.out.println(words.get(i) +" "+ count.get(i));
			pw.println(words.get(i) +" "+ count.get(i));
			System.out.println(words.get(i) +" "+ count.get(i));
			
		}
		pw.close();
	}

}
