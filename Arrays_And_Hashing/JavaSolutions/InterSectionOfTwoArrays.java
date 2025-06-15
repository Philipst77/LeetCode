package Arrays_And_Hashing.JavaSolutions;

import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> inter = new ArrayList<>();

        // Add unique elements from nums1 to seen
        for (int num : nums1) {
            if (!seen.contains(num)) {
                seen.add(num);
            }
        }

        // Check elements from nums2 for intersection
        for (int num : nums2) {
            if (seen.contains(num) && !inter.contains(num)) {
                inter.add(num);
            }
        }

        // Convert List to array
        int[] result = new int[inter.size()];
        for (int i = 0; i < inter.size(); i++) {
            result[i] = inter.get(i);
        }

        return result;
    }
}
