import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryNumberTest {

	@Test
	public void testCalculate() {
		BinaryNumber bn = new BinaryNumber();
		assertEquals(true, bn.calculate(5).equals("101"));
		assertEquals(true, bn.calculate(10).equals("1010"));
		assertEquals(true, bn.calculate(15).equals("1111"));
		assertEquals(true, bn.calculate(1024).equals("10000000000"));
	}

}
