package Arrays_And_Hashing.JavaSolutions;

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        Map<Integer, Integer> freq2 = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            freq1.put(num, freq1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            freq2.put(num, freq2.getOrDefault(num, 0) + 1);
        }

        for (int num : freq1.keySet()) {
            if (freq2.containsKey(num)) {
                int count = Math.min(freq1.get(num), freq2.get(num));
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
            }
        }

        // Convert result list to array
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}
