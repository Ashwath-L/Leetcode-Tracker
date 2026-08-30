# Last updated: 8/30/2026, 12:26:47 PM
1class Solution:
2    def minimumDeletions(self, nums):
3        n = len(nums)
4
5        minIndex = nums.index(min(nums))
6        maxIndex = nums.index(max(nums))
7
8        left = min(minIndex, maxIndex)
9        right = max(minIndex, maxIndex)
10
11        front = right + 1
12
13        back = n - left
14
15        frontBack = (left + 1) + (n - right)
16
17        return min(front, back, frontBack)