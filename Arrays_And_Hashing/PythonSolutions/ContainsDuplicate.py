
#package Arrays_And_Hashing.JavaSolutions;

#Contains Duplicate
#Given an integer array nums, return true if any value appears more than once
# in the array, otherwise return false.

# Input nums = [1,2,3,3]

#output true because 3 occurs more then once

# Input nums = [1,2,3,4]

#output false because each number in the array nums occurs once 

class Solution:
    def hasDuplicate(self, nums):
        seen = set()
        for num in nums:
            if num in seen:
                return True
            seen.add(num)
        return False


# Example usage:
sol = Solution()
print("nums1 has duplicate:", sol.hasDuplicate([1, 2, 3, 3]))  # True
print("nums2 has duplicate:", sol.hasDuplicate([1, 2, 3, 4]))  # False
