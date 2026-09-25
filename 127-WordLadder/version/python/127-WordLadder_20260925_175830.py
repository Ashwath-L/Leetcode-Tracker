# Last updated: 9/25/2026, 5:58:30 PM
1class Solution:
2    def generateParenthesis(self, n):
3        ans = []
4
5        def f(a, b, c):
6            if len(c) == 2 * n:
7                ans.append(c)
8                return
9
10            if a < n:
11                f(a + 1, b, c + "(")
12
13            if b < a:
14                f(a, b + 1, c + ")")
15
16        f(0, 0, "")
17        return ans