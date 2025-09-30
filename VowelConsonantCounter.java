public class VowelConsonantCounter {

    public static void main(String[] args) {
        String str = "SANDEEP REDDY";
        countVowelsAndConsonants(str);
    }

    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert the string to lowercase to handle both cases uniformly
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } 
            // Check if the character is a consonant (i.e., a letter but not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
            // Ignore other characters like spaces, numbers, or symbols
        }
        
        System.out.println("The original string is: " + str);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}