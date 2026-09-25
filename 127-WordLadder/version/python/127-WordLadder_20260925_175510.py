# Last updated: 9/25/2026, 5:55:10 PM
1class Solution:
2    def calculateMinimumHP(self, dungeon):
3        m = len(dungeon)
4        n = len(dungeon[0])
5
6        a = [[0] * (n + 1) for _ in range(m + 1)]
7
8        for i in range(m + 1):
9            a[i][n] = float('inf')
10
11        for j in range(n + 1):
12            a[m][j] = float('inf')
13
14        a[m][n - 1] = 1
15        a[m - 1][n] = 1
16
17        for i in range(m - 1, -1, -1):
18            for j in range(n - 1, -1, -1):
19                x = min(a[i + 1][j], a[i][j + 1])
20                a[i][j] = max(1, x - dungeon[i][j])
21
22        return a[0][0]