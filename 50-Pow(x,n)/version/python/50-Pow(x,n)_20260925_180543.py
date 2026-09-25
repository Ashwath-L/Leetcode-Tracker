# Last updated: 9/25/2026, 6:05:43 PM
1class Solution:
2    def spiralOrder(self, matrix):
3        ans = []
4
5        while matrix:
6            ans += matrix.pop(0)
7
8            if matrix and matrix[0]:
9                for i in range(len(matrix)):
10                    ans.append(matrix[i].pop())
11
12            if matrix:
13                ans += matrix.pop()[::-1]
14
15            if matrix and matrix[0]:
16                for i in range(len(matrix) - 1, -1, -1):
17                    ans.append(matrix[i].pop(0))
18
19        return ans