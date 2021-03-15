import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

class A implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
	String s;

	// A class constructor
	public A(int i, String s) {
		this.i = i;
		this.s = s;
	}
}

public class Serializationex {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		A a = new A(48, "ShwetaChahar");

		// Serializing 'a'
		FileOutputStream fos = new FileOutputStream("serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		// De-serializing 'a'
		FileInputStream fis = new FileInputStream("serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		A b = (A) ois.readObject();// down-casting object

		System.out.println(b.i + " " + b.s);

		// closing streams
		oos.close();
		ois.close();
	}
}
