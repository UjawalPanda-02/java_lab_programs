// write a program to check whether the year is leap year or not

import java.util.Scanner;

public class lab_prg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}