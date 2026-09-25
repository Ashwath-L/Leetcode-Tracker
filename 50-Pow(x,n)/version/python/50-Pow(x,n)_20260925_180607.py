# Last updated: 9/25/2026, 6:06:07 PM
1class Solution:
2    def canJump(self, nums):
3        a = 0
4
5        for i in range(len(nums)):
6            if i > a:
7                return False
8
9            a = max(a, i + nums[i])
10
11        return True