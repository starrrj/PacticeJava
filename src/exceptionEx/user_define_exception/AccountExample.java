package exceptionEx.user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		// 출금하기
		try {
			account.withdraw(30000);
			System.out.println("예금액: " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();	// 예외정보 #1
			System.out.println(message);		
			e.printStackTrace();				// 예외정보 #2
			System.out.println(e.toString());	// 예외정보 #3
		} // try-catch
		
	} // main
	
} // class

