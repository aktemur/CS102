package week03.bankAccount.v10;

public class Account {
    private int number;
    private double balance;
    private String currency;

    // Constructor
    public Account(int n, double b, String c) {
        number = n;
        balance = b;
        currency = c;
    }

    public void deposit(double d) {
        if (d > 0)
            balance = balance + d;
    }

    public void report() {
        System.out.println("Account " + number
                + " has " + balance
                + " " + currency + ".");
    }

    public int getAccountNumber() {
        return number;
    }
}

