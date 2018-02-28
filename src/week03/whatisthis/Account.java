package week03.whatisthis;

public class Account {
    private int id;
    private double balance;
    private String currency;

    // Constructor
    public Account(int id, double balance, String currency) {
        this.id = id;
        this.balance = balance;
        this.currency = currency;
    }

    public Account(int id, String currency) {
        // "this" in this case does not refer to an object,
        // it refers to another constructor.
        this(id, 0, currency);
    }

    public Account(int id) {
        this(id, "TL");
    }

    public void deposit(double d) {
        if (d > 0)
            balance = balance + d;
    }

    public void report() {
        System.out.println("Account " + this.id
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
