import java.util.Stack;
public class BinaryNumber {
	public String calculate(int n) {
		StringBuilder binary = new StringBuilder();
		Stack<Integer> binaryStack = new Stack<Integer>();
		while (n > 0) {
			binaryStack.push(n % 2);
			n = n / 2;
		}
		while (!binaryStack.empty()) {
			binary.append(binaryStack.pop());
		}
		return binary.toString();
	}
}
