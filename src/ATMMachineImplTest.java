import static org.junit.Assert.*;

import org.junit.Test;


public class ATMMachineImplTest {

	@Test
	public void testViewBalance() {
		ATMMachine atm = new ATMMachineImpl(90);
		assertEquals(90, atm.viewBalance());
	}


	@Test
	public void testDeposite() {
		ATMMachine atm = new ATMMachineImpl(90);
		atm.deposite(100);
		assertEquals(190, atm.viewBalance());
	}
	
	@Test
	public void testWithdraw() {
		ATMMachine atm = new ATMMachineImpl(90);
		atm.withdraw(100);
		assertEquals(90, atm.viewBalance());
		assertEquals(50, atm.withdraw(50));
		assertEquals(40, atm.viewBalance());
	}

	@Test
	public void testTransaction() {
		ATMMachine atm = new ATMMachineImpl(90);
		atm.deposite(20);
		assertEquals(110, atm.viewBalance());
		atm.withdraw(50);
		assertEquals(60, atm.viewBalance());
		atm.withdraw(30);
		assertEquals(30, atm.viewBalance());
	}
}
