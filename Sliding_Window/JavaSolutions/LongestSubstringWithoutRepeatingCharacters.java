package Sliding_Window.JavaSolutions;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();
        int L = 0;

        for (int R = 0; R < n; R++) {
            char currentChar = s.charAt(R);

            // If current character is already in the set, shrink the window
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(L));
                L++;
            }

            charSet.add(currentChar);
            maxLength = Math.max(maxLength, R - L + 1);
        }

        return maxLength;
    }
}
