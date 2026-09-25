# Last updated: 9/25/2026, 6:04:18 PM
1class Solution:
2    def rotate(self, matrix):
3        n = len(matrix)
4
5        for i in range(n):
6            for j in range(i, n):
7                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
8
9        for i in range(n):
10            matrix[i].reverse()