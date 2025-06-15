
package Arrays_And_Hashing.JavaSolutions;

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // Only lowercase English letters

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }
}
