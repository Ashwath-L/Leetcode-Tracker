# Last updated: 10/8/2026, 9:03:32 AM
1class Solution(object):
2    def removeOuterParentheses(self, s):
3        open = 0
4        res = []
5
6        for ch in s:
7            if ch == '(':
8                if open > 0:
9                    res.append(ch)
10                open += 1
11            else:
12                open -= 1
13                if open > 0:
14                    res.append(ch)
15
16        return ''.join(res)