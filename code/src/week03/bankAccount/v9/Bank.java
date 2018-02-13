package week03.bankAccount.v9;

public class Bank {
    private String name;
    private Customer[] customers;
    private int numCustomers;

    Bank(String n) {
        name = n;
        customers = new Customer[3];
        numCustomers = 0;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    void addCustomer(Customer c) {
        customers[numCustomers] = c;
        numCustomers++;
    }

    void display() {
        System.out.println("---- " + name + " ----");
        for (int i = 0; i < numCustomers; i++) {
            customers[i].report();
        }
        System.out.println("------------------");
    }
}
