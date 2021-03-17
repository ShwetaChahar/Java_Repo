package org.apex.exercise;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

class PairSum { 
    static HashMap<Integer, Integer> printpairs(int arr[], int sum) 
    { 
        HashSet<Integer> s = new HashSet<Integer>(); 
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
       
        
        for (int i = 0; i < arr.length; i++) { 
            int temp = sum - arr[i]; 
  
            // checking for condition 
            if (s.contains(temp)) { 
            	
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
				if (arr[i] < temp) {
					hmap.put(arr[i], temp);
					
				} else
					hmap.put(temp, arr[i]);
			}
			s.add(arr[i]);
		}
        return hmap;
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 9, 4, 1, 4, 45, 6, 10, 8, 8, 8, 6 };
		int n = 16;
		HashMap<Integer,Integer> hmap= printpairs(A,n);
		printupairs(hmap);
	}

	static void printupairs(HashMap<Integer,Integer> hmap ) {
		for (Entry<Integer, Integer> i: hmap.entrySet() )
		System.out.println("Key "+i.getKey()+" Value "+i.getValue());
	} 
} 

