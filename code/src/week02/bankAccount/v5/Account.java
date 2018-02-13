package week02.bankAccount.v5;

public class Account {
	int number;
	double balance;
	String currency;

	// Constructor
	public Account(int n, double b, String c) {
		number = n;
		balance = b;
		currency = c;
	}
	
	public void deposit(double d) {
		balance = balance + d;
	}
	
	public void report() {
		System.out.println("Account " + number 
				+ " has " + balance 
				+ " " + currency + ".");
	}
}
