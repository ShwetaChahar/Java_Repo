
public class MaxletterString {

	private static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String str = "dcdddghjjjjjjjjjjd";

		int count[] = new int[ASCII_SIZE];

		int len = str.length();
		// System.out.println(len);
		for (int i = 0; i < len; i++) {

			count[str.charAt(i)]++;
		}

//Initializa Max counts
		
		int maxcount = 0;
		char result = ' ';
		for (int i = 0; i < len; i++) {
			if (count[str.charAt(i) ] >  maxcount) { //current element is greater then 
				maxcount = count[str.charAt(i)];
				result = str.charAt(i);

			}
		}
		System.out.println(maxcount);
		System.out.println(result);
//Initializa Min counts
		//int mincount = len;
		int mincount = count[str.charAt(0)];
		result = str.charAt(0);
		// char result = ' ';
		for (int i = 0; i < len; i++) {
			if (count[str.charAt(i)] < mincount) { // current element is smaller then mincount
				mincount = count[str.charAt(i)]; // becomes min count
				result = str.charAt(i);

			}
		}
		if (1== mincount) {
		System.out.println(mincount);
		System.out.println(result);
		}
				
	}

}
