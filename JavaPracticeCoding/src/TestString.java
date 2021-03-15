
public class TestString {

	public static void main(String[] args) {
		String s1 = new String("HELLO"); 
		
		String s2 = new String("HELLO");
		
		String s4 = new String(s2);
		String s3 = s2;
		//System.out.println(s1 == s2); 
		System.out.println(s4 == s2); 
       // System.out.println(s1.equals(s2)); 
        System.out.println(s4.equals(s2)); 
	}
}
