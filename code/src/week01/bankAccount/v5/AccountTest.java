package week01.bankAccount.v5;

public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account(1, 100, "TL"); 
    Account account2 = new Account(2, 200, "USD");
    
    account1.report();
    account2.report();
    
    System.out.println();
    
    account1 = account2;
    
    account1.report();
    account2.report(); // What does this report print?
    
    // Deposit 50TL into account 1
    account1.deposit(50);
    
    // Deposit 300 USD into account 2
    account2.deposit(300);
    
    System.out.println();
    
    account1.report(); // What does this report print?
    account2.report(); // What does this report print?
  }
}
