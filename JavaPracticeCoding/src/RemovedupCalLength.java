import java.util.LinkedList;

public class RemovedupCalLength {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 33, 33, 44, 44, 55, 55, 55, 55, 55, 66 };
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		
		System.out.println("Count " + (i+1));
		
		
		for (int p=0;p<(i+1);p++) {
			System.out.print(arr[p]+",");
		}
	}

}
