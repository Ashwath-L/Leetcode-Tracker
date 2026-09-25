# Last updated: 9/25/2026, 5:54:12 PM
1class Solution:
2    def findMin(self, nums):
3        a = 0
4        b = len(nums) - 1
5
6        while a < b:
7            c = (a + b) // 2
8
9            if nums[c] > nums[b]:
10                a = c + 1
11
12            elif nums[c] < nums[b]:
13                b = c
14
15            else:
16                b -= 1
17
18        return nums[a]