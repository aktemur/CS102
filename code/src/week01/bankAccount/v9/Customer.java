package week01.bankAccount.v9;

public class Customer {
  private String name;
  private Account account;
  
  Customer(String n, Account a) {
    name = n;
    account = a;
  }
  
  void deposit(double d) {
    account.deposit(d);
  }
  
  void report() {
    System.out.println("Customer: "+name);
    account.report();
  }
  
  Account getAccount() {
    return account;
  }
}
