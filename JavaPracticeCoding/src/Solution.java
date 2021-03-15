import java.util.HashSet;
	public class Solution {
		public static void main(String[] args) {
			 //int[] A = {1, 3, 6, 4, 1, 2};
			int[] A = {1, 2, 3};
			// int[] A = {-1,-3};
			 
			 
			int result = solution(A);
			 System.out.println(result);
		}
	    public static int solution(int[] A) {
	       //int min = A[0];
	       int i=0;
	       int max = A[0];
	       
	       HashSet<Integer> set = new HashSet<Integer>();
	       for( i=0;i<A.length;i++){
	    	  if(A[i] > 0) {
	    		  set.add(A[i]);  
	    	  }
	          
	           if(A[i]>max){
	               max=A[i];
	           } 
	        }
	        for( i=1;i<=max;i++){
	            if(! set.contains(i)){
	                return i;
	                
	            }
	            else continue;
	        }
	        
	        //return (max+1);
	        return i;
	        
	    }
	}