package com.Rohan;

import java.util.Arrays;

/**
 * Problem: Reverse an Array In-Place
 * ----------------------------------
 * Definition:
 *   Reverse the order of elements in an array without using extra space.
 *
 * Approach:
 *   - Use two pointers: one at the start, one at the end.
 *   - Swap elements, move pointers inward until they meet.
 *   - This avoids creating another array, so it’s in-place.
 *
 * Complexity:
 *   Time  -> O(n)   (n = number of elements)
 *   Space -> O(1)   (constant extra space)
 */
public class ReverseArrayinPLACE {
    public void reverse(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseArrayinPLACE obj = new ReverseArrayinPLACE();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr));
        obj.reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
