package week04.bankAccount.v11;


public class AccountTest {
    public static void main(String[] args) {
        Bank bank = new Bank("FinanceBank");

        Account account1 = new Account(1, 100, "TL");
        Customer baris = new Customer("Baris Aktemur", account1);
        bank.add(baris);

        Account account2 = new Account(2, 200, "USD");
        Customer jack = new Customer("Jack Sawyer", account2);
        bank.add(jack);

        Account account3 = new Account(3, 300, "TL");
        Customer harry = new Customer("Harry Potter", account3);
        bank.add(harry);

        Account account4 = new Account(4, 400, "TL");
        Customer hermione = new Customer("Hermione Granger", account4);
        bank.add(hermione);

        bank.report();
    }
}
