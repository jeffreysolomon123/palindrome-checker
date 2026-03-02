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

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isCaseInsensitivePalindrome(word)) {
            System.out.println(word + " is a palindrome (case-insensitive)");
        } else {
            System.out.println(word + " is not a palindrome");
        }

        scanner.close();
    }
}