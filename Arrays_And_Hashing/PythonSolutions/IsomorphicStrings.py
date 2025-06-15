class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if not len(s) == len(t):
            return False

        map = {}
        map2 = {}
        for mp, mp2 in zip(s,t):
            
            if mp in map:
                if map[mp] != mp2:
                    return False
            else:
                map[mp] = mp2
            
            if mp2 in map2:
                if map2[mp2]!=mp:
                    return False
            else:
                map2[mp2]= mp

        return True
