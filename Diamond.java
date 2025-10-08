package Practicejava;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the top half: ");
        int n = scanner.nextInt();
        scanner.close();

        // Print the top half of the diamond (pyramid)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the bottom half of the diamond (inverted pyramid)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}