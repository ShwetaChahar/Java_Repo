import java.util.LinkedList;

public class Mergesortedlinkedlist {

	public static void main(String[] args) {
		// Input: 1->2->4, 1->3->4
		// Output: 1->1->2->3->4->4
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(4);
		System.out.println(l1);
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(2);
		l2.add(5);
		l2.add(6);
		System.out.println(l2);
		LinkedList<Integer> l3 = new LinkedList<Integer>();

		while ((!l1.isEmpty()) && (!l2.isEmpty())) {
			if  ((l1.peek()) <= (l2.peek()))
				l3.add(l1.poll());
			else
				l3.add(l2.poll());
		}
		
		while (!l1.isEmpty())
			l3.add(l1.poll());
		while (!l2.isEmpty())
			l3.add(l2.poll());
			
		System.out.println("Output " + l3);
	}
}
