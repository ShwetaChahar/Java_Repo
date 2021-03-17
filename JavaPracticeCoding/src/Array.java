package org.apex.exercise;

public class Array {

	static void getdiff(int a[],int b[]) 
		{
		for (int i=0;i<a.length;i++) 
		{
		int j=0;
			for(;j<b.length;j++) 
			{
				if(a[i]==b[j])
				break;
			}
				
				if (j==b.length) {	
				System.out.println(a[i]);
			    }
	        
	    }
}
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,10};
	int b[] = {2, 3, 1, 0, 5};
			getdiff(a,b);
	}
}


