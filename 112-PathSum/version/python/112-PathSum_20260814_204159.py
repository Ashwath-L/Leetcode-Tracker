# Last updated: 8/14/2026, 8:41:59 PM
1class Solution:
2    def singleNumber(self, nums):
3        ans = 0
4        for n in nums:
5            ans ^= n
6        return ans