package Arrays_And_Hashing.JavaSolutions;

import java.util.*;

class WordPattern{
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(c) && !wordToChar.containsKey(word)) {
                charToWord.put(c, word);
                wordToChar.put(word, c);
            } else {
                if (!word.equals(charToWord.get(c)) || wordToChar.get(word) != c) {
                    return false;
                }
            }
        }

        return true;
    }
}
