# Last updated: 7/26/2026, 9:14:15 PM
1class Solution(object):
2    def maximumProduct(self, nums):
3        nums.sort()
4        a=nums
5        b=(a[-1]*a[-2])*a[-3]
6        c=(a[0]*a[1])*a[-1]
7        if(b>c):
8            return b
9        else:
10            return c