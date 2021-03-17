package com.visa.practice;

import java.util.Scanner;

public class FactoryExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Enter Input :");
		String personType = sc.next();
		
		PersonFactory pf = new PersonFactory();

		pf.getPersonDefined(personType).eat();
		
//		Child c = (Child) pf.getPersonDefined(personType);
//		c.eat();
//
//		Dad d = (Dad) pf.getPersonDefined(personType);
//		d.eat();
//
//		Mom m = (Mom) pf.getPersonDefined(personType);
//		m.eat();

		
	}

}

interface Person {
	void eat();

	void sleep();

	void task();
}

class Child implements Person {

	@Override
	public void eat() {
		System.out.println("Child Eating");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");

	}

	@Override
	public void task() {
		System.out.println("Working");

	}

}

class Dad implements Person {

	@Override
	public void eat() {
		System.out.println("Dad Eating");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");

	}

	@Override
	public void task() {
		System.out.println("Working");

	}

}

class Mom implements Person {

	@Override
	public void eat() {
		System.out.println("Mom Eating");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");

	}

	@Override
	public void task() {
		System.out.println("Working");

	}

}

class PersonFactory {
	public Person getPersonDefined(String personType) {
		if (personType.equals("Child")) {
			return new Child();

		} else if (personType.equals("Dad")) {

			return new Dad();

		} else if (personType.equals("Mom")) {

			return new Mom();

		}
		return null;
	}
}
