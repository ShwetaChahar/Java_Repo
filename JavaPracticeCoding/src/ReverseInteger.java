public class ReverseInteger {
	static int n = 345;
	static int revn = 0;
	int q;
	static int r = 0;

	public static void main(String[] args) {
		while (n != 0) {
			revn = revn * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(revn);
	}
}
