public class Concurrencythread {
	public static synchronized void main(String[] args) {
		First f1 = new First();
		Second s1 = new Second();
		Third t1 = new Third();
		f1.start();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s1.start();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();

	}
}

class First extends Thread {
	public void run(int arr[]) {
		// public void firstindex(int arr[]) {
		int i = 0;
		int a[] = { 1, 2, 3 };
		while (a[i] == a[1]) {
			System.out.println("First");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Second extends Thread {
	public void run(int arr[]) {
		// public void secondIndex(int arr[]) {
		int i = 0;
		int a[] = { 1, 2, 3 };
		while (a[i] == a[2]) {
			System.out.println("Second");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Third extends Thread {
	public void run(int arr[]) {
		// public void thirdindex(int arr[]) {
		int i = 0;
		int a[] = { 1, 2, 3 };
		while (a[i] == a[3]) {
			System.out.println("Third");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
