//class Consumer1
import java.util.Stack;
public class Consumer1 extends Thread{
	private Stack<Integer> input;
	public Consumer1(Stack<Integer> input) {
		this.input = input;
	}
	public void run() {
		while (!this.input.isEmpty()) {
			System.out.println("Consumer 1 pop: " + input.pop());
		}
	}
}
