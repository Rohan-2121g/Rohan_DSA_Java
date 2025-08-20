package com.Rohan;

/**
 * Problem: Maximum Subarray Sum (Kadane’s Algorithm)
 * --------------------------------------------------
 * Definition:
 *   Find the largest possible sum of a contiguous subarray.
 *
 * Approach:
 *   - At each step, decide:
 *        either extend the previous subarray (current + nums[i]),
 *        or start a new one with nums[i].
 *   - Keep track of the maximum seen so far.
 *
 * Complexity:
 *   Time  -> O(n)
 *   Space -> O(1)
 */
public class MaxSubarraySum {
    public int kadane(int[] nums) {
        int maxSoFar = nums[0];
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maxSoFar = Math.max(maxSoFar, current);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        MaxSubarraySum obj = new MaxSubarraySum();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum = " + obj.kadane(nums)); // 6
    }
}
