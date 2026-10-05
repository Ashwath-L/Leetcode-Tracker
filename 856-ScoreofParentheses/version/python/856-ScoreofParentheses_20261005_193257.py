# Last updated: 10/5/2026, 7:32:57 PM
1class Solution:
2    def scoreOfParentheses(self, s: str) -> int:
3        score = 0
4        depth = 0
5
6        for i, ch in enumerate(s):
7            if ch == '(':
8                depth += 1
9            else:
10                depth -= 1
11                if s[i - 1] == '(':
12                    score += 1 << depth
13
14        return score