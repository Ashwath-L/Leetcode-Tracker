# Last updated: 9/27/2026, 3:40:37 PM
1import heapq
2
3class Solution:
4    def getSkyline(self, buildings):
5        a = []
6
7        for l, r, h in buildings:
8            a.append((l, -h, r))
9            a.append((r, 0, 0))
10
11        a.sort()
12
13        b = [(0, float('inf'))]
14        ans = []
15        c = 0
16
17        for x, h, r in a:
18
19            while b and b[0][1] <= x:
20                heapq.heappop(b)
21
22            if h:
23                heapq.heappush(b, (h, r))
24
25            d = -b[0][0]
26
27            if d != c:
28                ans.append([x, d])
29                c = d
30
31        return ans