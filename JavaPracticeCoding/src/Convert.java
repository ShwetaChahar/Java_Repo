public class Convert{
	public static void main(String[] args) {
		String str1 = "1";
		long result = 0;
		int n = str1.length();
		int index =0;
		while(index<n)
		{
			result=result*10+ (str1.charAt(index++)-'0');
		}
		System.out.println(result);
		
	}
}