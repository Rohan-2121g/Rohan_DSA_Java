package com.Rohan;

import java.util.HashSet;

/**
 * Problem: Longest Substring Without Repeating Characters
 * -------------------------------------------------------
 * Definition:
 *   Find the length of the longest substring where all characters are unique.
 *
 * Approach:
 *   - Use a sliding window with a HashSet to track seen characters.
 *   - Expand the right pointer, and if a duplicate is found, shrink from the left.
 *   - Keep track of the maximum length seen.
 *
 * Complexity:
 *   Time  -> O(n)
 *   Space -> O(n) for the HashSet
 */
public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestUniqueSubstring obj = new LongestUniqueSubstring();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));    // 1
    }
}
