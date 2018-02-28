package week01.bankAccount.v2;

public class Account {
	int number;
	double balance;
	String currency;
	
	public void deposit(double d) {
		balance = balance + d;
	}
}
