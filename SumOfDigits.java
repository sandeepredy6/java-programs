import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int originalNumber = number; // Store the original number for printing

        // Use Math.abs() to handle negative numbers, if needed
        number = Math.abs(number);
        
        while (number != 0) {
            // Get the last digit by using the modulus operator
            int lastDigit = number % 10;
            
            // Add the last digit to the sum
            sum += lastDigit;
            
            // Remove the last digit by performing integer division
            number /= 10;
        }
        
        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);
        
        scanner.close();
    } 
}
