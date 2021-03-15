import java.util.HashSet;

public class PairIntegerArray {

	public static void main(String[] args) {
		Integer [] a = {2, 11, 5, 1, 4, 7} ;
		//Integer [] a ={2, 4, 2, 1, 11, 15} ;
//				Check if there exist two elements in an array whose sum is equal to the sum of rest of the array
//				Input  : arr[] = {2, 11, 5, 1, 4, 7}
//				Output : Elements are 4 and 11
//				Note that 4 + 11 = 2 + 5 + 1 + 7

//				Input  : arr[] = {2, 3, 3, 2, 11, 15}
//				Output : Elements do not exist
	method(a );
}

	private static void method(Integer[] a) {
		int sum =0;
		for (int i=0 ;i<a.length;++i)
			sum = sum+a[i];
		System.out.println(sum);
		if (sum%2!=0) {
			System.out.println("Not found");
			return;
		}
			int	hsum = sum/2;
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<a.length;++i) {
			int finds = hsum- a[i];
			if(s.contains(finds))
			{
				System.out.print(a[i]+",");
				System.out.println(finds);
				return;			
			}
			else {
				s.add(a[i]);
			}
		}
		System.out.println("Not found");
	}
}

	
	
	
	

	
	
	
