import static org.junit.Assert.*;

import org.junit.Test;


public class GreatestAbsoluteValueTest {

	@Test
	public void testFindTheGreatestAbsoluteValueOf() {
		GreatestAbsoluteValue gav = new GreatestAbsoluteValue();
		int [] listNum1 = {-9, 5, 2, -16, 2, 7, 0, 2, 15};
		assertEquals(16, gav.findTheGreatestAbsoluteValueOf(listNum1));
		int [] listNum2 = {-9, 52, 2, -16, 2, 75, 0, -200, 1578};
		assertEquals(1578, gav.findTheGreatestAbsoluteValueOf(listNum2));
	}

}
