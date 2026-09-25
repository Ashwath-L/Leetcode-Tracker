# Last updated: 9/25/2026, 6:01:54 PM
1class Solution:
2    def combinationSum2(self, candidates, target):
3        candidates.sort()
4        ans = []
5
6        def f(i, a, b):
7            if b == 0:
8                ans.append(a)
9                return
10
11            if b < 0:
12                return
13
14            for j in range(i, len(candidates)):
15                if j > i and candidates[j] == candidates[j - 1]:
16                    continue
17
18                if candidates[j] > b:
19                    break
20
21                f(j + 1, a + [candidates[j]], b - candidates[j])
22
23        f(0, [], target)
24
25        return ans