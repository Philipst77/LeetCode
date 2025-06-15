class Solution:
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        
        freq ={}
        freq2={}
        hold =[]
        for num1 in nums1:
            freq[num1] = freq.get(num1,0)+1
        for num2 in nums2:
            freq2[num2] = freq2.get(num2,0)+1
        
        for num in freq:
            if num in freq2:
                hold.extend([num] * min(freq[num], freq2[num]))

        return hold