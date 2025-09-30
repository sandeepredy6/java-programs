public class RemoveWhitespace {

    public static void main(String[] args) {
        String originalString = "  Diva reddy baby girl  ";

        // The "\\s" regex matches any whitespace character.
        // The empty string "" is the replacement.
        String newString = originalString.replaceAll("\\s", "");

        System.out.println("Original string: '" + originalString + "'");
        System.out.println("String with no whitespace: '" + newString + "'");
    }
}