package week14.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

    private static int[] array = {10, 45, 67, 36, 98};

    public static void main(String[] args) {
        compute();
    }

    private static void compute() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();
            int index = a / b;
            System.out.println(array[index]);
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("That index does not exist!");
        } catch (ArithmeticException ae) {
            System.out.println("Bad things happened!");
        } catch (InputMismatchException ime) {
            System.out.println("Give me an integer, please!");
            compute(); // Recursive call to try again.
        }
    }
}

