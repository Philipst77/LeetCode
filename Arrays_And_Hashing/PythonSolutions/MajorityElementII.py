class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        freq={}
        for num in nums:
            freq[num] = freq.get(num,0)+1
        
        max_val = max(freq.values())

        keys_with_max_vals = [k for k,v in freq.items() if v == max_val]
        
        return keys_with_max_vals

def majorityElementII(self, nums: list[int]) -> list[int]:
    freq ={}
    for num in nums:
        freq[num] = freq.get(num, 0) + 1

    threshold = len(nums) // 3

    result = [k for k, v in freq.items() if v > threshold]
    
    return result
