package week03.bankAccount.v9;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank("FinansBank");
        int accountNo = 1;

        System.out.println("Welcome to " + bank.getName());
        while (true) {
            System.out.print("Enter customer name (empty to quit): ");
            String customerName = input.nextLine();
            if (customerName.equals(""))
                break;

            System.out.print("Enter currency: ");
            String curr = input.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = Double.parseDouble(input.nextLine());

            bank.addCustomer(new Customer(customerName, new Account(accountNo, balance, curr)));
            accountNo++;

            bank.display();
        }
        System.out.println("Bye!");
    }
}
