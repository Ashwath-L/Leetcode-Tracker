# Last updated: 9/25/2026, 5:49:30 PM
1class Solution:
2    def minCut(self, s):
3        n = len(s)
4        a = [0] * (n + 1)
5        
6        for i in range(n + 1):
7            a[i] = i - 1
8
9        for i in range(n):
10            l = i
11            r = i
12
13            while l >= 0 and r < n and s[l] == s[r]:
14                a[r + 1] = min(a[r + 1], a[l] + 1)
15                l -= 1
16                r += 1
17
18            l = i
19            r = i + 1
20
21            while l >= 0 and r < n and s[l] == s[r]:
22                a[r + 1] = min(a[r + 1], a[l] + 1)
23                l -= 1
24                r += 1
25
26        return a[n]