# Last updated: 8/18/2026, 6:57:32 PM
1class Solution:
2    def numDistinct(self, s: str, t: str) -> int:
3        if len(t) > len(s):
4            return 0
5
6        memo = {}
7
8        def dfs(i, j):
9            if i == len(s) or j == len(t) or len(s) - i < len(t) - j:
10                return int(j == len(t))
11            if (i, j) in memo:
12                return memo[(i, j)]
13
14            ans = dfs(i + 1, j)
15            if s[i] == t[j]:
16                ans += dfs(i + 1, j + 1)
17            memo[(i, j)] = ans
18            return ans
19
20        return dfs(0, 0)