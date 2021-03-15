import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProductsUsers {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("p1");
		products.add("p3");
		products.add("p1");
		products.add("p12");
		products.add("p1");
		products.add("p89");
		products.add("p1");
		products.add("p1");
		products.add("p1");
		products.add("p11");
		products.add("p11");
		products.add("p12");
		ArrayList<String> users = new ArrayList<String>();
		users.add("u1");
		users.add("u2");
		users.add("u1");
		users.add("u1");
		users.add("u1");
		users.add("u11");
		users.add("u10");
		users.add("u20");
		users.add("u20");
		users.add("u2");
		users.add("u1");
		users.add("u19");
		HashMap<String, HashSet<String>> hasmapmain = new HashMap<String, HashSet<String>>();
		// HashSet<String> hashset = new HashSet<String>();
		for (int i = 0; i < products.size(); i++) {
			String prod = products.get(i); 
			String user = users.get(i);
			HashSet<String> hs = hasmapmain.get(prod);
			if (hs != null) 
				hs.add(user);
			else {
				HashSet<String> newhs = new HashSet<String>();
				newhs.add(user);
				hasmapmain.put(prod, newhs);
			}
		}
		//	System.out.println(hasmapmain);
		for (Map.Entry<String, HashSet<String>> e : hasmapmain.entrySet())
			System.out.println(e.getKey() + ":\t Size: "+e.getValue().size() + "\t Value: "+e.getValue());
	}
}























