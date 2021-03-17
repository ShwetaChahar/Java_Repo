package com.apex.problems.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleGroupByValues {

	public static void main(String[] args) {
		StreamExampleGroupByValues obj = new StreamExampleGroupByValues();

		obj.getUnsortedPersonList();
	}

	class Person {
		public int id;
		public String fname;
		public String lname;

		public Person(int id, String fname, String lname) {
			this.id = id;
			this.fname = fname;
			this.lname = lname;

		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
		}
	}

	
	private void getUnsortedPersonList() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(22, "Ravi", "Sharma"));
		people.add(new Person(23, "Samir", "Sharma"));
		people.add(new Person(24, "Pooja", "Varma"));
		people.add(new Person(25, "Raj", "Jain"));
		people.add(new Person(26, "Ram", "Jain"));
		//System.out.println(people);
		HashMap<String, List<Person>> collect = (HashMap<String, List<Person>>) people.stream()
				.collect(Collectors.groupingBy(p -> p.getLname()));
		System.out.println("groupByName: " + collect);

	}

}
