import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String str = "{[()]}()";		
		Stack<Character> st = new Stack<Character>();
		int len = str.length();
		if (len % 2 != 0) {
			System.out.println("Not Balanced");
			return;
		}

		ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('[','{','('));
		
		System.out.println(list);
		for (int i = 0; i < len; i++) {
			if (list.contains(str.charAt(i))) {
				st.push(str.charAt(i));
			} else {
				// this is where we handle closing brackets
				char c = str.charAt(i);
				char peak = st.peek();
				if ((c == ')' && peak == '(') || (c == '}' && peak == '{') || (c == ']' && peak == '['))
					st.pop();
				else {
					System.out.println("Not-- Balanced");
					return;
				}
			}
		}
		if (st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}
}
