package week02.bankAccount.v7;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1, 100, "TL");
        Account account2 = new Account(2, 200, "USD");

        Customer baris = new Customer("Baris Aktemur", account1);
        Customer jack = new Customer("Jack Sawyer", account2);

        baris.report();
        jack.report();

        baris.getAccount().setCurrency("USD");
        jack.deposit(100);

        System.out.println();

        baris.report();
        jack.report();
    }
}
