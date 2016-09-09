//class Consumer 2
import java.util.Stack;
public class Consumer2 extends Thread{
	private Stack<Integer> input;
	public Consumer2(Stack<Integer> input) {
		this.input = input;
	}
	public void run() {
		while (!this.input.isEmpty()) {
			System.out.println("Consumer 2 pop: " + input.pop());
		}
	}
}
