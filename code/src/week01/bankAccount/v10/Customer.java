package week01.bankAccount.v10;

public class Customer {
  private String name;
  private Account account;
  
  public Customer(String n, Account a) {
    name = n;
    account = a;
  }
  
  public void deposit(double d) {
    account.deposit(d);
  }
  
  public void report() {
    System.out.println("Customer: "+name);
    account.report();
  }
  
  public Account getAccount() {
    return account;
  }
}
