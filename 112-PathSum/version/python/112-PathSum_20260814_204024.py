# Last updated: 8/14/2026, 8:40:24 PM
1class Solution:
2    def generate(self, numRows):
3        res = []
4        for i in range(numRows):
5            row = [1] * (i + 1)
6            for j in range(1, i):
7                row[j] = res[-1][j-1] + res[-1][j]
8            res.append(row)
9        return res