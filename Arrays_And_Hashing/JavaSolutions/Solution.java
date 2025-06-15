package Arrays_And_Hashing.JavaSolutions;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (map.containsKey(sc)) {
                if (map.get(sc) != tc) {
                    return false;
                }
            } else {
                map.put(sc, tc);
            }

            if (map2.containsKey(tc)) {
                if (map2.get(tc) != sc) {
                    return false;
                }
            } else {
                map2.put(tc, sc);
            }
        }

        return true;
    }
}
