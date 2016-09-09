import static org.junit.Assert.*;

import org.junit.Test;


public class LargestObjectTest {
	LargestObject l = new LargestObject();
	@Test
	public void testListInteger() {
		Integer [] listInteger = {7, -1, 4, -15, 59, 100, 13, -45, 22, 77};
		assertEquals(100, (int) l.findLargestObjectOf(listInteger));
	}
	
	@Test
	public void testListCharacter() {
		Character[] listCharacter = {'A', '^', 'z', ' ', '!', 't', 'u'};
		assertEquals('z', (char) l.findLargestObjectOf(listCharacter));
	}
	
	@Test
	public void testListString() {
		String[] listString = {"pass", "pasa", "zerga", "abdb", "egeg", "dghb", "ryreh"};
		assertEquals("zerga", (String) l.findLargestObjectOf(listString));
	}
}
