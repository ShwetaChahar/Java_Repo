package com.visa.practice;

public class FindValueAndOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 }; 
		int o = 2;
		FindValueAndOccurence obj = new FindValueAndOccurence();
		obj.countOccurrences(arr,o);

	}

	public int countOccurrences(int arr[],int o) 
    { 
        int occur = 0; 
        for (int i=0; i<arr.length; i++) 
            if (o == arr[i]) 
              occur++; 
        
        System.out.println(occur);
        //System.out.println(arr);
        return occur; 
        
        
    } 
}
