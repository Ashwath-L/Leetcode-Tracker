# Last updated: 9/25/2026, 6:00:11 PM
1class Solution:
2    def isValidSudoku(self, board):
3        for i in range(9):
4            a = set()
5            b = set()
6
7            for j in range(9):
8                if board[i][j] != ".":
9                    if board[i][j] in a:
10                        return False
11                    a.add(board[i][j])
12
13                if board[j][i] != ".":
14                    if board[j][i] in b:
15                        return False
16                    b.add(board[j][i])
17
18        for i in range(0, 9, 3):
19            for j in range(0, 9, 3):
20                a = set()
21
22                for x in range(i, i + 3):
23                    for y in range(j, j + 3):
24                        if board[x][y] != ".":
25                            if board[x][y] in a:
26                                return False
27                            a.add(board[x][y])
28
29        return True
30        