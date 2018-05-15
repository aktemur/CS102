package week15.exceptionExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAccess {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = consoleScanner.nextLine();

        File file = new File(fileName);
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            System.out.println("END");
        } catch (FileNotFoundException fnfe) {
            System.out.println("The file does not exist.");
        }
    }
}
