package com.apex.problems.practice;

import java.util.HashMap;
import java.util.Map;

class Employee{

	String name;
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {

		this.name = name;

	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
//	foreach(s-> iterating hashset)
//	System.out.println(s);
//	{A,B,A}
	
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		return this.name.equals(((Employee)obj).name);
//	}
}

public class XYZ {

public static void main(String[] args){
		Map<Employee,Integer> map = new HashMap<Employee,Integer>();
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		map2.put(new Integer(12),null);
		map2.put(new Integer(12),null);
		map2.put(new Integer(12),null);
		map2.put(new Integer(14),null);
//		map1.put(new String("e1"),null);
//		map1.put(new String("e1"),null);
//		map1.put(new String("e1"),78);
////		map1.put("e1",null);
//		map1.put("e1",null);
		map.put(new Employee("e1"),null);
		map.put(new Employee("e1"),null);
//		System.out.println(map);
		System.out.println(map2);
	}

}
