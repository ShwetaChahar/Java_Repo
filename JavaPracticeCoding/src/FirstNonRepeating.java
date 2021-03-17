package com.apex.problems.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String str = "SsHhhwetaa";
		//first non -repeating character 
		//first repeating character
		
		//employee list first name if == S filter employee.name = return firstname list names.

		List<String> strls = Arrays.asList(str.split(""));
			System.out.println(strls);
			//HashMap<String,Integer> hmp = new HashMap<String,Integer>();
			
			HashMap<String,Integer> hmp =(HashMap<String,Integer>)strls.stream()
			.collect(Collectors.toMap(s->s, s->1, (v1,v2)->v1+v2));
			System.out.println(hmp);
					
					
			Optional<String> res =strls.stream()
			//.filter(k-> hmp.get(k) == 1)
			.filter(r-> hmp.get(r)>1)
			.findFirst();
			System.out.println("first non repeated: "+res);
		
		
		
	}

}
