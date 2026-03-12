import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";

        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }

    private static boolean checkPalindrome(String text) {
        if (text == null) return false;
        String clean = text.toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) {
                return false;
        String input = "level";
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
        PalindromeService service = new PalindromeService();
        String input = "racecar";

        boolean result = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

class PalindromeService {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return true;
    }
}
    }
}

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}}
