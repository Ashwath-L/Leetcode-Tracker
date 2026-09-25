# Last updated: 9/25/2026, 6:00:52 PM
1class Solution:
2    def combinationSum(self, candidates, target):
3        ans = []
4
5        def f(i, a, b):
6            if b == 0:
7                ans.append(a)
8                return
9
10            if b < 0 or i == len(candidates):
11                return
12
13            f(i, a + [candidates[i]], b - candidates[i])
14            f(i + 1, a, b)
15
16        f(0, [], target)
17
18        return ans