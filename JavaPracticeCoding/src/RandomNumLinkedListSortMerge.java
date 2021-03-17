package org.apex.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

public class RandomNumLinkedListSortMerge {

	public static void main(String[] args) {
		LinkedList<Integer> llist1 = new LinkedList<Integer>();
		LinkedList<Integer> llist2 = new LinkedList<Integer>();
		LinkedList<Integer> llist3 = new LinkedList<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> alist2 = new ArrayList<Integer>();
		Random rdm = new Random();
		int size = rdm.nextInt(20) + 5;
		// System.out.println("Length linked first list " + size);
		generateList(alist, rdm, size);
		generateList(alist2, rdm, size);
		generateSortedLinkedList(alist, llist1);
		generateSortedLinkedList(alist2, llist2);
		System.out.println("Sorted Linked List first: " + llist1);
		System.out.println("Sorted Linked List sec: " + llist2);
		mergeSortedLinkedLists(llist1, llist2, llist3);
		System.out.println("Sorted Linked List out: " + llist3);
		// System.out.println("LinkedList first : "+llist1);
	}

	public static void generateList(ArrayList<Integer> a, Random r, int s) {
		for (int i = 0; i < s; i++) {
			int randomint = r.nextInt(20);
			// System.out.println(randomint);
			a.add(randomint);
		}
		// System.out.println("Unsorted Alist1" + alist);
	}

	public static void generateSortedLinkedList(ArrayList<Integer> a, LinkedList<Integer> l) {
		Collections.sort(a);
		// System.out.println("Sorted Alist1: " + alist);
		l.addAll(a);
	}

	public static void mergeSortedLinkedLists(LinkedList<Integer> llist1, LinkedList<Integer> llist2,
			LinkedList<Integer> llist3) {
		while ((!llist1.isEmpty()) && (!llist2.isEmpty())) {
			if ((llist1.peek()) <= (llist2.peek()))
				llist3.add(llist1.poll());
			else
				llist3.add(llist2.poll());
		}

		while (!llist1.isEmpty())
			llist3.add(llist1.poll());
		while (!llist2.isEmpty())
			llist3.add(llist2.poll());
	}
}
