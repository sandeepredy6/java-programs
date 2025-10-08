package Practicejava;

public class Reversesnumberstring {
		    
	    public static void main(String[] args) {
	        String originalString = "56234";
	        
	        // Create a StringBuilder with the original string
	        StringBuilder builder = new StringBuilder(originalString);
	        
	        // Use the built-in reverse() method
	        String reversedString = builder.reverse().toString();
	        
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String: " + reversedString);
	    }
	}

