# Last updated: 9/25/2026, 5:56:25 PM
1class Solution:
2    def findWords(self, board, words):
3
4        a = {}
5
6        for w in words:
7            b = a
8
9            for c in w:
10                if c not in b:
11                    b[c] = {}
12
13                b = b[c]
14
15            b["#"] = w
16
17        ans = []
18        m = len(board)
19        n = len(board[0])
20
21        def f(i, j, a):
22            c = board[i][j]
23
24            if c not in a:
25                return
26
27            b = a[c]
28
29            if "#" in b:
30                ans.append(b["#"])
31                del b["#"]
32
33            board[i][j] = "@"
34
35            if i > 0:
36                f(i - 1, j, b)
37
38            if i < m - 1:
39                f(i + 1, j, b)
40
41            if j > 0:
42                f(i, j - 1, b)
43
44            if j < n - 1:
45                f(i, j + 1, b)
46
47            board[i][j] = c
48
49            if len(b) == 0:
50                del a[c]
51
52        for i in range(m):
53            for j in range(n):
54                f(i, j, a)
55
56        return ans