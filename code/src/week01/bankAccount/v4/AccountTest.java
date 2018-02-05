package week01.bankAccount.v4;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(1, 100, "TL");
		
		Account account2 = new Account(2, 200, "USD");
		
		account1.report();
		account2.report();
		
		// Deposit 50TL into account 1
		account1.deposit(50);
		
		// Deposit 300 USD into account 2
		account2.deposit(300);
		
		account1.report();
		account2.report();
	}
}
