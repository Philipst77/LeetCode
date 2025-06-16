package Arrays_And_Hashing.JavaSolutions;
import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> seen = new HashMap<>();
        HashMap<Character, Integer> seen2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            seen.put(c, seen.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            seen2.put(c, seen2.getOrDefault(c, 0) + 1);
        }

        for (char c : seen2.keySet()) {
            if (seen2.get(c) > seen.getOrDefault(c, 0)) {
                return c;
            }
        }

        return '\0'; // default return, should never hit due to constraints
    }
}
