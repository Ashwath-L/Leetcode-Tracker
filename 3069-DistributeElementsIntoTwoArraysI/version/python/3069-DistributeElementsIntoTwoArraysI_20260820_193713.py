# Last updated: 8/20/2026, 7:37:13 PM
1class Solution:
2    def resultArray(self, nums: List[int]) -> List[int]:
3        nums1 = [nums[0]]
4        nums2 = [nums[1]]
5
6        for i in range(2, len(nums)):
7            if nums1[-1] > nums2[-1]:
8                nums1.append(nums[i])
9            else:
10                nums2.append(nums[i])
11
12        return nums1 + nums2