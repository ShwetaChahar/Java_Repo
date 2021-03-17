package org.apex.exercise;

import java.util.HashSet;

public class PrintADDTOK 
{

	private static int res;

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,78,34,1,4};
		int k = 79;
		System.out.println(pairuniq(a, k));
		

}

	private static int pairuniq(int[] a, int k) {
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i=0; i< a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if (a[i]+a[j] == k)
				{
					hset.add(a[i]);
					hset.add(a[j]);
				}
			}
		}	
			
		for(int i : hset) {
			res++;
		}
		return res;
	}
}

