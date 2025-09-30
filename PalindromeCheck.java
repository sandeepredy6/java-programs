public class PalindromeCheck {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";
        String str3 = "dad";

        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindromeTwoPointers(str1)); // true
        System.out.println("\"" + str2 + "\" is a palindrome: " + isPalindromeTwoPointers(str2)); // false
        System.out.println("\"" + str3 + "\" is a palindrome: " + isPalindromeTwoPointers(str3));
    }

    public static boolean isPalindromeTwoPointers(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }

        String cleanedStr = str.toLowerCase(); // Handle case-insensitivity
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Mismatched characters found
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
}