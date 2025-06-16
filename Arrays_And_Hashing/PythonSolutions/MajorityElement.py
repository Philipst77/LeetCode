class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        freq ={}
        for num in nums:
            freq[num] = freq.get(num,0)+1

        majority = max(freq,key=freq.get)


        return majority
