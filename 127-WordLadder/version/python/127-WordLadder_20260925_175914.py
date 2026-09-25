# Last updated: 9/25/2026, 5:59:14 PM
1class Solution:
2    def search(self, nums, target):
3        a = 0
4        b = len(nums) - 1
5
6        while a <= b:
7            c = (a + b) // 2
8
9            if nums[c] == target:
10                return c
11
12            if nums[a] <= nums[c]:
13                if nums[a] <= target < nums[c]:
14                    b = c - 1
15                else:
16                    a = c + 1
17
18            else:
19                if nums[c] < target <= nums[b]:
20                    a = c + 1
21                else:
22                    b = c - 1
23
24        return -1