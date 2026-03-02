import java.util.Scanner;
import java.util.Stack;

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

    public static boolean isStackPalindrome(String word) {
        String cleaned = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String word = scanner.nextLine();

        if (isStackPalindrome(word)) {
            System.out.println("It is a palindrome (using stack)");
        } else {
            System.out.println("It is not a palindrome");
        }

        scanner.close();
    }
}