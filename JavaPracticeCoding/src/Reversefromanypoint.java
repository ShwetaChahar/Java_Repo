
public class Reversefromanypoint {
	static int arr[] = { 1, 3, 5, 6, 8, 9, 1, 3, 6 }; // 653163198.....891361356
	// expected output array = { 8, 9, 1, 3, 6, 1, 3, 5, 6 };

	public static int []  main(String[] args) {
		calculate(arr);
		return arr;
	}

	static void calculate(int arr[]) {
		int len = arr.length;
		int k = 3;
		int temp;
		temp = k;
		int m = 0;
		int i = 0;

		while (i < k) {
			m = arr[i];
			arr[i] = arr[k];
			arr[k] = m;
			i++;
			k--;
		}
		k = temp + 1;
		int j = (len - 1);
		int p = 0;
		while (k < j) {
			p = arr[k];
			arr[k] = arr[j];
			arr[j] = p;
			k++;
			j--;
		}
		int start = 0;
		int end = len - 1;
		int interim = 0;
		while (start < end) {
			interim = arr[start];
			arr[start] = arr[end];
			arr[end] = interim;
			start++;
			end--;
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
