package week01.bankAccount.v6;

public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account(1, 100, "TL");
    Account account2 = new Account(2, 200, "USD");

    account1.report();
    account2.report();

    account1.setCurrency("USD");
    account2.deposit(-100);
    
    System.out.println();

    account1.report(); // What does this report print?
    account2.report(); // What does this report print?
  }
}