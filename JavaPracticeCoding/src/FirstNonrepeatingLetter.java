import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonrepeatingLetter {
	public static void main(String[] args) {
		nonreapeated();
	}
	static LinkedHashMap<Character, Integer> hmaporder = new LinkedHashMap<Character, Integer>();
	static String s1 = "loveleetcode";
	static int len = s1.length();
	static char c1 = ' ';
	int ic1 = 0;
	static Character nonreapeated() 
	{
		for (int i=0;i<len;i++) 
		{
			char c0 = s1.charAt(i);
			hmaporder.put(c0, hmaporder.getOrDefault(c0, 0)+1);
		}	
		System.out.println(hmaporder);
		//Iterating over hash map
	for (Entry<Character, Integer> entry : hmaporder.entrySet()) {
		if(entry.getValue()==1) {
			return entry.getKey();
			
		}
			
		
	}
	return c1;

//	for(int i = 0;i<len;i++)
//	{
//		char c0 = s1.charAt(i);
//		if (hmap.get(c0) == 1) 
//		{
//			System.out.println("Index " + i);
//			System.out.println("Character " + s1.charAt(i));
//		}
//			
//		
//	}

   }
}
