package org.apex.exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

//Integer prty Q where elements are reverse sorted 
public class PriorityQexample {
	public static void main(String[] args) {
		PriorityQueue<Map.Entry<Integer,String>> pq = new PriorityQueue<Map.Entry<Integer,String>>(new Mycomparater());

//		int a[]= {67,2,14,8,16,27};
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();

		hmap.put(23, "Nitin");
		hmap.put(45, "Kapil");
		hmap.put(20, "Sam");
		hmap.put(18, "Adam");
		
		for(Map.Entry<Integer,String> e: hmap.entrySet())
			pq.add(e);
		while(!pq.isEmpty()) {
			
					System.out.println(pq.poll());
				
				//System.out.println(n);
		}
		
		
			
	}
}
class Mycomparater		implements Comparator<Map.Entry<Integer,String>>{

	
	public int compare(Map.Entry<Integer,String> o1, Map.Entry<Integer,String> o2) {
		
		return o1.getValue().compareTo(o2.getValue());
		//if its -1 o1 +1 o2 equal =0
	}
	
}
//class numComparator implements Comparator {

	
	

