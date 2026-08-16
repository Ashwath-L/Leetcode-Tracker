# Last updated: 8/16/2026, 9:25:34 AM
1class Solution(object):
2    def maximumGap(self, skill, station):
3        a = len(skill)
4        b = len(station)
5        c = [0] * a
6        d = 0
7        for e in range(b):
8            if d < a and station[e] == skill[d]:
9                c[d] = e
10                d += 1
11
12        f = [0] * a
13        g = a - 1
14        for h in range(b - 1, -1, -1):
15            if g >= 0 and station[h] == skill[g]:
16                f[g] = h
17                g -= 1
18
19        i = 0
20        for j in range(1, a):
21            k = f[j] - c[j - 1]
22            if k > i:
23                i = k
24        return i