package week03.bankAccount.v10;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank("FinansBank");
        int accountNo = 1;

        System.out.println("Welcome to " + bank.getName());
        while (true) {
            System.out.println("Enter 0 to quit.");
            System.out.println("Enter 1 to add a new customer. ");
            System.out.println("Enter 2 to remove a customer. ");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                System.out.print("Enter customer name: ");
                String customerName = input.nextLine();
                System.out.print("Enter currency: ");
                String curr = input.nextLine();

                System.out.print("Enter initial balance: ");
                double balance = Double.parseDouble(input.nextLine());

                Account account = new Account(accountNo, balance, curr);
                Customer customer = new Customer(customerName, account);
                bank.addCustomer(customer);

                accountNo++;
            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accountNumber = Integer.parseInt(input.nextLine());

                bank.removeCustomer(accountNumber);
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Enter a valid choice.");
            }

            bank.display();
        }
        System.out.println("Bye!");
    }
}
