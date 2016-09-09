
public class ATMMachineImpl implements ATMMachine{
	private int balance = 0;
	
	public ATMMachineImpl(int balance) {
		this.balance = balance;
	}
	
	public int viewBalance() {
		return balance;
	}

	public void deposite(int money) {
		if (money > 0) 
			balance += money;
	}

	public int withdraw(int wdamount) {
		if (balance > wdamount) {
			balance -= wdamount;
			return wdamount;
		}
		return 0;
	}

}
