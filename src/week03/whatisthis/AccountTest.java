package week03.whatisthis;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1, 100, "TL");
        Account account2 = new Account(2, "USD");
        Account account3 = new Account(3);

        account1.report();
        account2.report();
        account3.report();

        account1.setCurrency("USD");
        account2.deposit(100);
        account3.deposit(500);

        System.out.println();

        account1.report();
        account2.report();
    }
}