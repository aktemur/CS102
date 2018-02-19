package week03.whatisthis;

public class Account {
    private int number;
    private double balance;
    private String currency;

    // Constructor
    public Account(int number, double balance, String currency) {
        this.number = number;
        this.balance = balance;
        this.currency = currency;
    }

    public Account(int number, String currency) {
        this(number, 0, currency);
    }

    public void deposit(double d) {
        if (d > 0)
            balance = balance + d;
    }

    public void report() {
        System.out.println("Account " + this.number
                + " has " + this.balance
                + " " + this.currency + ".");
    }

    void setCurrency(String currency) {
        if (this.currency.equals("TL") && currency.equals("USD")) {
            balance = balance / 1.50;
        }
        if (this.currency.equals("USD") && currency.equals("TL")) {
            balance = balance * 1.50;
        }
        this.currency = currency;
    }
}
