package week04.bankAccount.v12;

class Bank {
    private String name;
    private FlexibleList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new FlexibleList<Customer>();
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
