# Last updated: 8/15/2026, 3:38:12 PM
1class Solution:
2    def longestSubsequence(self, nums):
3        x = 0
4        for n in nums:
5            x ^= n
6        if x:
7            return len(nums)
8        if all(n == 0 for n in nums):
9            return 0
10        return len(nums) - 1