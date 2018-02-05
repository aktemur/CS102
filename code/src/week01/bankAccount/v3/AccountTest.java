package week01.bankAccount.v3;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.number = 1;
		account1.balance = 100;
		account1.currency = "TL";
		
		Account account2 = new Account();
		account2.number = 2;
		account2.balance = 200;
		account2.currency = "USD";
		
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
