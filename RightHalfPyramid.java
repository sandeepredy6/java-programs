package Practicejava;

import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Outer loop for rows
        for (int i = 1; i <= rows; ++i) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}