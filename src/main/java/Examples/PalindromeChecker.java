package Examples;

public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = cleanedStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
