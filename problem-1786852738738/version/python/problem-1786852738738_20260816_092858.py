# Last updated: 8/16/2026, 9:28:58 AM
1class Solution(object):
2    def elevatorRequests(self, n, start, requests):
3        a = len(requests)
4        b = [r[0] for r in requests]
5        c = [r[1] for r in requests]
6
7        d = float('inf')
8        e = [[d] * a for _ in range(1 << a)]
9        for f in range(a):
10            g = abs(start - c[f])
11            e[1 << f][f] = max(g, b[f])
12
13        for h in range(1 << a):
14            for i in range(a):
15                j = e[h][i]
16                if j == d or not (h & (1 << i)):
17                    continue
18                for k in range(a):
19                    if h & (1 << k):
20                        continue
21                    l = max(j + abs(c[i] - c[k]), b[k])
22                    m = h | (1 << k)
23                    if l < e[m][k]:
24                        e[m][k] = l
25
26        n2 = (1 << a) - 1
27        return min(e[n2][i] for i in range(a))