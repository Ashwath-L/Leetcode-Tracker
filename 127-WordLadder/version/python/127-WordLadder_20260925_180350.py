# Last updated: 9/25/2026, 6:03:50 PM
1class Solution:
2    def permuteUnique(self, nums):
3        nums.sort()
4        ans = []
5
6        def f(a, b):
7            if not b:
8                ans.append(a)
9                return
10
11            for i in range(len(b)):
12                if i > 0 and b[i] == b[i - 1]:
13                    continue
14
15                f(a + [b[i]], b[:i] + b[i + 1:])
16
17        f([], nums)
18
19        return ans