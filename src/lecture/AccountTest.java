package lecture;


class Account {
    private int number;
    private double balance;
    private String currency;

    // Constructor
    public Account(int number, double balance, String currency) {
        this.number = number;
        this.balance = balance;
        this.currency = currency;
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

class CustomerList {
    private Customer[] elements;
    private int numElements;

    public CustomerList() {
        this.elements = new Customer[3];
        this.numElements = 0;
    }

    public void add(Customer item) {
        if (numElements == elements.length) {
            Customer[] newList = new Customer[numElements * 2];
            for (int i = 0; i < numElements; i++) {
                newList[i] = elements[i];
            }
            elements = newList;
        }
        elements[numElements] = item;
        numElements++;
    }

    public int size() {
        return numElements;
    }

    public Customer get(int index) {
        return elements[index];
    }
}

class Bank {
    private String name;
    private CustomerList customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new CustomerList();
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void report() {
        System.out.println("Bank: " + name);
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            customer.report();
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Bank bank = new Bank("FinanceBank");

        Account account1 = new Account(1, 100, "TL");
        Customer baris = new Customer("Baris Aktemur", account1);
        bank.add(baris);

        Account account2 = new Account(2, 200, "USD");
        Customer jack = new Customer("Jack Sawyer", account2);
        bank.add(jack);

        Account account3 = new Account(3, 300, "TL");
        Customer harry = new Customer("Harry Potter", account3);
        bank.add(harry);

        Account account4 = new Account(4, 400, "TL");
        Customer hermione = new Customer("Hermione Granger", account4);
        bank.add(hermione);

        bank.report();
    }
}
