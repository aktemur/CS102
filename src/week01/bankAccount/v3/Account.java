package week01.bankAccount.v3;

public class Account {
	int number;
	double balance;
	String currency;
	
	public void deposit(double d) {
		balance = balance + d;
	}
	
	public void report() {
		System.out.println("Account " + number 
				+ " has " + balance 
				+ " " + currency + ".");
	}
}
