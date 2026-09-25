# Last updated: 9/25/2026, 6:03:16 PM
1class Solution:
2    def permute(self, nums):
3        ans = []
4
5        def f(a, b):
6            if len(a) == len(nums):
7                ans.append(a)
8                return
9
10            for i in range(len(b)):
11                f(a + [b[i]], b[:i] + b[i + 1:])
12
13        f([], nums)
14
15        return ans