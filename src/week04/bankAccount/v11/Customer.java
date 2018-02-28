package week04.bankAccount.v11;

class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(double d) {
        account.deposit(d);
    }

    public void report() {
        System.out.println("Customer: " + name);
        account.report();
    }

    public Account getAccount() {
        return account;
    }
}
