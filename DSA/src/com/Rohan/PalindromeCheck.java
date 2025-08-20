package com.Rohan;

/**
 * Problem: Palindrome Check
 * --------------------------
 * Definition:
 *   A string is a palindrome if it reads the same forward and backward.
 *
 * Approach:
 *   - Use two pointers: one at the start, one at the end.
 *   - Compare characters until they meet.
 *   - If all match, it's a palindrome.
 *
 * Complexity:
 *   Time  -> O(n)
 *   Space -> O(1)
 */
public class PalindromeCheck {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck obj = new PalindromeCheck();
        System.out.println(obj.isPalindrome("madam")); // true
        System.out.println(obj.isPalindrome("hello")); // false
    }
}
