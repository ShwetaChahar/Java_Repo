import java.util.HashMap;


public class HashSet2Sum {
	static HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	static HashMap<Integer,Integer> hmapnodup = new HashMap<Integer,Integer>();
	static void target(int a[],int sum) {
		
		for (int i=0;i< a.length; i++) {
			hmap.put(a[i], i);
		}
		for (int i=0;i<a.length;i++) {
			int  target = (sum - a[i]);    // A[] = {1,3,52,6,9}   52+1 =53 sum=53,target = 52,a[i]=1
			if (hmap.containsKey(target) && (hmap.get(target) != i )){
				System.out.println("Pair of numbers (" +target+","+ a[i]+")");
				if (target > a[i]) {
					hmapnodup.put(target, a[i]);					
				}
				else 
				{ 
					hmapnodup.put(a[i],target);
					
				}
				
					
				//System.out.println("number two " +a[i]);
			}
			//System.out.println(a[i]);
		}
		System.out.println("I am here1");
		System.out.println(hmapnodup.entrySet());
		
	}
	
	
public static void main(String[] args) {
	
	int A[] = {1,2,5,7,9,2,6,4,9};
	int n = 13;
			target(A,n);
}
}
