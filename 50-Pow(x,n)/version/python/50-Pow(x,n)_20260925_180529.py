# Last updated: 9/25/2026, 6:05:29 PM
1class Solution:
2    def maxSubArray(self, nums):
3        a = nums[0]
4        b = nums[0]
5
6        for i in range(1, len(nums)):
7            a = max(nums[i], a + nums[i])
8            b = max(b, a)
9
10        return b