# Last updated: 10/6/2026, 9:20:02 AM
1class Solution:
2    def minAddToMakeValid(self, s: str) -> int:
3        open = 0
4        ans = 0
5        for c in s:
6            if c == '(':
7                open += 1
8            else:
9                if open > 0:
10                    open -= 1
11                else:
12                    ans += 1
13
14        return ans + open