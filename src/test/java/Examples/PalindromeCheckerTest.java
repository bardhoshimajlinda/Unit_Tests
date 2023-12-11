package Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("level"));
        assertTrue(palindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(palindromeChecker.isPalindrome("hello"));

        assertTrue(palindromeChecker.isPalindrome("Able , was I saw eLba"));
        assertFalse(palindromeChecker.isPalindrome("Palindrome with spaces"));
    }

    @Test
    public void testIsPalindromeWithNull() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertThrows(IllegalArgumentException.class, () -> {
            palindromeChecker.isPalindrome(null);
        });
    }
}