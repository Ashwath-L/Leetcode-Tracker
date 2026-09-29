# Last updated: 9/29/2026, 7:41:15 PM
1class Solution:
2    def hasValidPath(self, grid):
3        m = len(grid)
4        n = len(grid[0])
5
6        if grid[0][0] == ')' or grid[m - 1][n - 1] == '(':
7            return False
8
9        if (m + n - 1) % 2 == 1:
10            return False
11
12        a = set()
13
14        def f(i, j, c):
15            if c < 0:
16                return False
17
18            if c > m + n:
19                return False
20
21            if i == m - 1 and j == n - 1:
22                return c == 0
23
24            if (i, j, c) in a:
25                return False
26
27            a.add((i, j, c))
28
29            if i + 1 < m:
30                if grid[i + 1][j] == '(':
31                    if f(i + 1, j, c + 1):
32                        return True
33                else:
34                    if f(i + 1, j, c - 1):
35                        return True
36
37            if j + 1 < n:
38                if grid[i][j + 1] == '(':
39                    if f(i, j + 1, c + 1):
40                        return True
41                else:
42                    if f(i, j + 1, c - 1):
43                        return True
44
45            return False
46
47        return f(0, 0, 1)