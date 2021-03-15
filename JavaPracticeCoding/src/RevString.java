import java.util.Arrays;

public class RevString {

	public static void main(String[] args) {
		String originalstr = "Hello";
		int len=originalstr.length();
		String revstring = " ";
		char arr [ ]=originalstr.toCharArray();
		char temp ;
		
		for(int i=len-1;i>=0;i--) {
			
			revstring = revstring+originalstr.charAt(i);
		}
//		int i=0;
//		int j=len-1;
//		while(i<j) {
//			temp = arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
//		originalstr = Arrays.toString(arr);
System.out.println("Org "+originalstr);
	}

}
