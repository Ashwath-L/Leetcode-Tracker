# Last updated: 9/25/2026, 6:00:32 PM
1class Solution:
2    def countAndSay(self, n):
3        a = "1"
4
5        for i in range(n - 1):
6            b = ""
7            j = 0
8
9            while j < len(a):
10                c = j
11
12                while c < len(a) and a[c] == a[j]:
13                    c += 1
14
15                b += str(c - j) + a[j]
16                j = c
17
18            a = b
19
20        return a