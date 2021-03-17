package com.visa.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompareStream {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Hemendra");
		map.put(99, "Andrew");
		map.put(103, "Anish");
		map.put(18, "Mohan");
		map.put(11, "Christine");
		map.put(109, "Rebeca");
		map.put(111, "David");
		map.put(19, "Rahim");
		map.put(10, "Krishna");
		System.out.println("Input: "+map);
		CompareStream obj = new CompareStream();
		obj.orderdesc(map);
	}

	public void orderdesc(HashMap<Integer, String> map) {
		List<Map.Entry<Integer, String>> collect = map.entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());
		System.out.println("Output: "+collect);
	}
}
