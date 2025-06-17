class Solution:
    def findDisappearedNumbers(self, nums: list[int]) -> list[int]:
        


        ap =[]
        for i in range(1,len(nums)+1):
            if i not in nums:
                ap.append(i)
        return ap


