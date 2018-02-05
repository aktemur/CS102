package week01.bankAccount.v1;

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
		
		System.out.println("Account " + account1.number 
				+ " has " + account1.balance 
				+ " " + account1.currency + ".");
		System.out.println("Account " + account2.number 
				+ " has " + account2.balance 
				+ " " + account2.currency + ".");
		
		// Deposit 50TL into account 1
		account1.balance = account1.balance + 50;
		
		// Deposit 300 USD into account 2
		account2.balance = account2.balance + 300;
		
		System.out.println("Account " + account1.number 
				+ " has " + account1.balance 
				+ " " + account1.currency + ".");
		System.out.println("Account " + account2.number 
				+ " has " + account2.balance 
				+ " " + account2.currency + ".");
	}

}
