import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isSimplePalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static boolean isCaseInsensitivePalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static boolean isCleanPalindrome(String word) {
        String cleaned = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String word = scanner.nextLine();

        if (isCleanPalindrome(word)) {
            System.out.println("It is a palindrome (ignoring spaces & special characters)");
        } else {
            System.out.println("It is not a palindrome");
        }

        scanner.close();
    }
}