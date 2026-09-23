# Last updated: 9/23/2026, 9:32:54 AM
1class Solution(object):
2    def moveZeroes(self, nums):
3        j=0
4        for i in range(len(nums)):
5            if(nums[j]==0):
6                b=nums.pop(j)
7                nums.append(b)
8            else:
9                j+=1
10        return nums