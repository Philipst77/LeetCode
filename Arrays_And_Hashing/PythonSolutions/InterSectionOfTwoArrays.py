
class Solution:
    def intersection(self, nums1: list[int], nums2: list[int]) -> list[int]:
        
        seen = []
        inter = []
        for i in range(len(nums1)):
            if nums1[i] not in seen:
                seen.append(nums1[i])
        for j in range(len(nums2)):
            if nums2[j] in seen and nums2[j] not in inter:
                inter.append(nums2[j])
        return inter