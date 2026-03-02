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

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or sentence: ");
        String word = scanner.nextLine();

        System.out.println("\nChoose method:");
        System.out.println("1. Simple Palindrome");
        System.out.println("2. Case-Insensitive Palindrome");
        System.out.println("3. Ignore spaces & special characters");
        System.out.println("4. Stack Based Palindrome");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        boolean result = false;

        switch (choice) {
            case 1:
                result = isSimplePalindrome(word);
                break;
            case 2:
                result = isCaseInsensitivePalindrome(word);
                break;
            case 3:
                result = isCleanPalindrome(word);
                break;
            case 4:
                result = isStackPalindrome(word);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }
}