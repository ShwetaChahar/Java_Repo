package com.apex.problems.practice;

import java.util.LinkedHashMap;

public class LRUCache {

	public static void main(String[] args) {
		LRUCache obj = new LRUCache();
		obj.test4LRU();
	}

	public void test4LRU() {
		MemoryCache mc = new MemoryCache(5);
		mc.put(1, 1);mc.put(2, 2);mc.put(3, 3);mc.put(4, 4);mc.put(5, 5);
		System.out.println(mc.valueMap);
		mc.get(1);
		System.out.println(mc.valueMap);
		mc.put(6, 6); 
		System.out.println(mc.valueMap);
	}

	class MemoryCache {
		public LinkedHashMap<Integer, Integer> valueMap;
		int MAX_SIZE;
		public MemoryCache(int size) {
			valueMap = new LinkedHashMap<Integer, Integer>();
			this.MAX_SIZE = size;
		}
		public int get(int key) {
			if (valueMap.containsKey(key)) {
				int value = valueMap.get(key);
				//to get LRU kv since its Linked HashMap 
				valueMap.remove(key);
				valueMap.put(key, value);
				return value;
			}
			return -1;
		}

		public void put(int key, int value) {
			if (valueMap.containsKey(key)) {
				valueMap.remove(key);
			}else if (valueMap.size() == MAX_SIZE) {
				int firstKey = valueMap.entrySet().iterator().next().getKey();
				valueMap.remove(firstKey);
			}
			valueMap.put(key, value);

		}

	}

}
