public class ThreadsafeSingleton {
	private static ThreadsafeSingleton soleinstance;

	private ThreadsafeSingleton() {
		System.out.println("Creating...");
	}

	synchronized public static ThreadsafeSingleton getinstance() {
		if (soleinstance == null) {
			ThreadsafeSingleton soleinstance = new ThreadsafeSingleton();
		}
		return soleinstance;
	}
}
