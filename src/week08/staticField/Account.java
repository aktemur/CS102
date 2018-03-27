package week08.staticField;

public class Account {
    private static int count = 0;
	private int number;
	private double balance;
	private String currency;

    public Account(double balance, String currency) {
        this.number = count;
        count++;
        this.balance = balance;
        this.currency = currency;
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
