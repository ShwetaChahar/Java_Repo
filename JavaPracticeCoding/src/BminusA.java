import java.util.HashSet;

public class BminusA {
	public static void main(String[] args) {

		// a={2,5,3,6}, b= {5,8,3,7,2,4,6,3} , print elements from b which is not in
		// a(bminusa)
		int a[] = { 2, 5, 3, 6 };
		int b[] = { 5, 8, 3, 7, 2, 4, 6, 3 };

		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i : a) {
			hset.add(i);
		}
		System.out.println(hset);
		for (int i =0;i<b.length;i++ ){
			//System.out.println(b[i]);
			if (!hset.contains(b[i])) {
				System.out.print(b[i]+",");
			}
		}
	}

}