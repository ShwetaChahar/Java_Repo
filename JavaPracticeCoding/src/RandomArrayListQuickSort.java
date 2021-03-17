package org.apex.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomArrayListQuickSort {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		generateArrayList(alist);
		System.out.println("alist: " + alist);
		System.out.println("alist length: " + alist.size());
		int index = selectRandomIndex(alist.size(), 0);
		System.out.println("index: " + index);
		int element = alist.get(index);
		System.out.println("element at index: " + alist.get(index));
		selectElementsGreaterAndLess(alist, index);
		System.out.println("alist[After]:" + alist);
	}

	public static void generateArrayList(ArrayList<Integer> alist) {
		Random rdm = new Random();
		int size = selectRandomIndex(10, 10);
		for (int i = 0; i < size; i++) {
			int randomint = selectRandomIndex(60, 30);
			alist.add(randomint);
		}
	}

	public static int selectRandomIndex(int in, int off) {
		Random rdm = new Random();
		return rdm.nextInt(in) + off;
	}

	public static void selectElementsGreaterAndLess(ArrayList<Integer> l, int i) {
	
		int ele = l.get(i);
		Collections.swap(l, 0, i);
		int size = l.size();
		int s = 0, e=size-1;
		
		while(s<e) {
			while((s < size) && l.get(s) <= ele)
				++s;
			while((e > -1) && l.get(e) > ele)
				--e;
			if (s<e) {
				Collections.swap(l, s, e);
			}
			//System.out.println(l);
		}
		--s;
		Collections.swap(l, 0, s);
		//System.out.println(l);
	}
}
