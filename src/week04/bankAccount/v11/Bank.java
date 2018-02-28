package week04.bankAccount.v11;

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
