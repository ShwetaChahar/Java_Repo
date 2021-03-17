package org.apex.exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class RandomNumber {

	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();

		randomnumllistfill(llist);
		System.out.println(llist.size());
		System.out.println(llist);

		deleteDups(llist);
		System.out.println("Linked List No dup" + llist);
		System.out.println("Linked List No dup size " + llist.size());
	}

	public static void deleteDups(LinkedList<Integer> llist) {
		LinkedHashSet lhset = new LinkedHashSet<Integer>();
		lhset.addAll(llist);
		llist.clear();
		System.out.println(llist.addAll(lhset));
	}

	public static LinkedList<Integer> randomnumllistfill(LinkedList<Integer> llist) {
		Random rdm = new Random();
		int size = rdm.nextInt(99) + 1;
		System.out.println("length " + size);
		for (int i = 0; i < size; i++) {
			int randomint = rdm.nextInt(99) + 1;
			// System.out.println("Random num is: " + randomint);
			llist.add(randomint);
		}
		return llist;
	}
}
