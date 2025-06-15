class Solution:
    def firstUniqChar(self, s: str) -> int:
        
        freq = {}

        # Count frequencies
        for char in s:
            freq[char] = freq.get(char, 0) + 1

        # Find first unique character
        for i, char in enumerate(s):
            if freq[char] == 1:
                return i

        return -1  # No unique character found
