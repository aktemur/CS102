package week01.bankAccount.v10;

import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Customer> customers;
  
  public Bank(String n) {
    name = n;
    customers = new ArrayList<Customer>();
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String n) {
    name = n;
  }
  
  public void addCustomer(Customer c) {
	  customers.add(c);
  }
  
  public void removeCustomer(int accountNumber){
	  for(int i = 0; i < customers.size(); i++) {
		  Customer customer = customers.get(i);
		  Account account = customer.getAccount();
		  if(account.getAccountNumber() == accountNumber) {
			  customers.remove(customer);
		  }
	  }
	  
  }
  
  public void display() {
    System.out.println("---- "+name+" ----");
    for(int i=0; i < customers.size(); i++) {
    	customers.get(i).report();
    }
    System.out.println("------------------");
  }
}
