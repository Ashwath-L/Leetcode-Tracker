# Last updated: 8/11/2026, 9:03:01 PM
1class Solution:
2    def missingInteger(self, nums):
3        s = nums[0]
4
5        for i in range(1, len(nums)):
6            if nums[i] == nums[i - 1] + 1:
7                s += nums[i]
8            else:
9                break
10
11        while s in nums:
12            s += 1
13
14        return s