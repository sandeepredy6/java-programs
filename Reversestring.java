package Practicejava;

public class Reversestring {
    
    public static void main(String[] args) {
        String originalString = "HelloWrold";
        
        // Create a StringBuilder with the original string
        StringBuilder builder = new StringBuilder(originalString);
        
        // Use the built-in reverse() method
        String reversedString = builder.reverse().toString();
        
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}