import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class ConsumerThreadTest {

	@Test
	public void test() {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(9);
		s.push(8);
		s.push(7);
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		Consumer1 c1 = new Consumer1(s);
		Consumer2 c2 = new Consumer2(s);
		
		c1.start();
		c2.start();
	}

}
