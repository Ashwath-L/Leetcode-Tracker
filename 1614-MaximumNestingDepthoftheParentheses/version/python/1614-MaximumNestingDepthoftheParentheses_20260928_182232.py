# Last updated: 9/28/2026, 6:22:32 PM
1class Solution:
2    def maxDepth(self, s: str) -> int:
3        depth = 0
4        ans = 0
5
6        for c in s:
7            if c == '(':
8                depth += 1
9                ans = max(ans, depth)
10            elif c == ')':
11                depth -= 1
12
13        return ans