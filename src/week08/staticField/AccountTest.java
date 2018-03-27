package week08.staticField;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(100, "TL");
		Account account2 = new Account(200, "USD");
        Account account3 = new Account(300, "EUR");
        Account account4 = new Account(400, "TL");
        Account account5 = new Account(500, "USD");
        Account account6 = new Account(600, "EUR");

        account1.report();
		account2.report();
        account3.report();
        account4.report();
        account5.report();
        account6.report();
	}
}
