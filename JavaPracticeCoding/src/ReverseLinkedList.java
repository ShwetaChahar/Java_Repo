import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(5);
		l1.add(15);
		l1.add(3);
		l1.add(9);
		l1.add(18);
		System.out.println("Input "+ l1);
		LinkedList<Integer> l2 =new LinkedList<Integer>();
		while(!l1.isEmpty()) {
			l2.addFirst(l1.poll());
		}
		System.out.println("revOutput " + l2);

	}

}
