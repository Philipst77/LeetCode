class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        maxLength =0
        charSet = set()
        L =0

        for R in range(n):
            if s[R] not in charSet:
                charSet.add(s[R])
                maxLength = max(maxLength, R -L +1)
            else:
                while s[R] in charSet:
                    charSet.remove(s[L])
                    L +=1
                charSet.add(s[R])
        return maxLength