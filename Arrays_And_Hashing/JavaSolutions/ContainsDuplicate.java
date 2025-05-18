package Arrays_And_Hashing.JavaSolutions;

// Contains Duplicate
// Given an integer array nums, return true if any value appears more than once
// in the array, otherwise return false.

// Input nums = [1,2,3,3]

// output true because 3 occurs more then once

// Input nums = [1,2,3,4]

// output false because each number in the array nums occurs once 

import java.util.HashSet;

public class ContainsDuplicate {

    static class Solution {
        public boolean hasDuplicate(int[] nums) {

            HashSet<Integer> freq = new HashSet<>();

            for (int i : nums) {
                if (freq.contains(i)) {
                    return true;
                } else {
                    freq.add(i);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 2, 3, 4 };

        System.out.println("nums1 has duplicate: " + sol.hasDuplicate(nums1));
        System.out.println("nums2 has duplicate: " + sol.hasDuplicate(nums2));
    }
}