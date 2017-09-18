import java.util.LinkedList;

public class StackMachine {

	public static void main(String[] args) {
        System.out.println("Expected solution: 76");
        System.out.println("Actual solution: " + getSolution("13+62*7+*"));
    }



	public static int getSolution(String s) {
		LinkedList<Integer> stack = new LinkedList(); // 'Stack' would be a good class as well

		if (s == null || s.length() == 0)
			return -1;

		for (int n=0; n<s.length(); ++n) {
			char c = s.charAt(n);

			if (c >= '0' && c <= '9') { // Check whether the char represents a digit
				stack.push(c - '0'); // Convert from char to int
			} else if (stack.size() >= 2) { // There must be at least two entries on the stack in order to start operating
				if (c == '+') {
					int x = stack.pop() + stack.pop();
					if (x < 4096) // The stack entry cannot be bigger than 12-bit
						stack.push(x);
					else return -1;
				} else if (c == '*') {
					int x = stack.pop() * stack.pop();
					if (x < 4096)
						stack.push(x);
					else return -1;
				} else return -1;
			} else return -1;
		}

		return stack.peek();
	}

}

