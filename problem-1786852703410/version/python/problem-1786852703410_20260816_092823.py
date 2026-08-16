# Last updated: 8/16/2026, 9:28:23 AM
1class Solution(object):
2    def maximumGap(self, skill, station):
3        
4        a = len(skill)
5        b = len(station)
6        c = [0] * a
7        d = 0
8        for e in range(b):
9            if d < a and station[e] == skill[d]:
10                c[d] = e
11                d += 1
12
13        f = [0] * a
14        g = a - 1
15        for h in range(b - 1, -1, -1):
16            if g >= 0 and station[h] == skill[g]:
17                f[g] = h
18                g -= 1
19
20        i = 0
21        for j in range(1, a):
22            k = f[j] - c[j - 1]
23            if k > i:
24                i = k
25        return i