package org.apex.exercise;

public class Threaddemo {
	public static synchronized void main(String[] args) {
		Evens obj2 = new Evens();
		Odds obj1 = new Odds();
		obj1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();

	}
}

class Evens extends Thread {

	public void run() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Odds extends Thread {

	public void run() {
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 != 0) {
				System.out.println(b[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
