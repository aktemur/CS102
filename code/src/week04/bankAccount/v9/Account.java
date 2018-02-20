package week04.bankAccount.v9;

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

    void setCurrency(String newCurrency) {
        if (currency.equals("TL") && newCurrency.equals("USD")) {
            balance = balance / 1.50;
        }
        if (currency.equals("USD") && newCurrency.equals("TL")) {
            balance = balance * 1.50;
        }
        currency = newCurrency;
    }
}

