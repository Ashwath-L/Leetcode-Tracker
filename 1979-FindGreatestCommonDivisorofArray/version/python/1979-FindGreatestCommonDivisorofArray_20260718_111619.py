# Last updated: 7/18/2026, 11:16:19 AM
1class Solution(object):
2    def findGCD(self, nums):
3        a = max(nums)
4        b = min(nums)
5        while b != 0:
6            a, b = b, a % b
7        return(a)
8
9        