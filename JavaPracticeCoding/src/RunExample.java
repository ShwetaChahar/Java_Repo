
interface Add {
	double pcadd(double x, int y);
}

interface Multipy {
	int pcmul(int x, int y);
}

//Lamda is a way to give functionality as argument in class.
//No need to have the lines of code in anonymous class.
public class RunExample {

	public static void main(String[] args) {
		Add a = (A1, A2) -> {
			System.out.println(A1 + A2);
			return A1 + A2;
		};
		Multipy m = (A1, A2) -> {
			System.out.println(A1 * A2);
			return A1 * A2;
		};
		a.pcadd(3.67, 4);
		m.pcmul(3, 5);
		double f = 5.67;
		System.out.println(++f);
	}

}
