package exceptionEx.user_define_exception;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) { // 입급
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{ // 출금
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족:" + (money-balance)+ "모자람");
		}
		balance -= money;
	}
}
