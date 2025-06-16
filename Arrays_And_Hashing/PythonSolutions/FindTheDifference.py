class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        

        seen = {}
        seen2= {}
        for char in s:
            seen[char] = seen.get(char,0)+1

        for char in t:
            seen2[char] = seen2.get(char,0)+1

        for char in seen2:
            if seen2[char] > seen.get(char,0):
                return char 
     
        
        return 