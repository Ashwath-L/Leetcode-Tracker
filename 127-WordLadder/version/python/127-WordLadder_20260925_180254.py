# Last updated: 9/25/2026, 6:02:54 PM
1class Solution:
2    def jump(self, nums):
3        a = 0
4        b = 0
5        c = 0
6
7        for i in range(len(nums) - 1):
8            b = max(b, i + nums[i])
9
10            if i == c:
11                a += 1
12                c = b
13
14        return a