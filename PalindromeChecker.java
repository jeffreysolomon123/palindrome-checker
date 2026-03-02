public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App ===");

        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("madam is a palindrome");
        } else {
            System.out.println("madam is not a palindrome");
        }
    }
}