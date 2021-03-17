package org.apex.exercise;

public class FindStringElement {
	static String findelement(String arr[], String x) {
		@SuppressWarnings("unused")
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(x)) {
				b = true;
				System.out.println("index value " + i);
				break;
			}
		}
		return x;
	}
	public static void main(String[] args) {
		String A[] = { "AA", "AB", "BA", "BB","ADC","SDF" };
		String x = "SDF";
		findelement(A, x);
	}
}