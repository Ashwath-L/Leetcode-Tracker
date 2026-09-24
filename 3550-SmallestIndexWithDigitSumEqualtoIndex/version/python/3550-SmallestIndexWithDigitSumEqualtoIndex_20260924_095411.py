# Last updated: 9/24/2026, 9:54:11 AM
1class Solution(object):
2    def smallestIndex(self, nums):
3        for i in range(len(nums)):
4            b=list(map(int,str(nums[i])))
5            c=0
6            for j in b:
7                c+=j
8            if(c==i):
9                return i
10        return -1        