# Last updated: 7/27/2026, 9:45:42 PM
1class Solution(object):
2    def maxProduct(self, nums):
3        nums.sort()
4        a=(nums[-1])-1
5        b=(nums[-2])-1
6        return a*b    