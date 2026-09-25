# Last updated: 9/25/2026, 5:53:34 PM
1class Solution:
2    def maxPoints(self, points):
3        n = len(points)
4        ans = 0
5
6        def g(a, b):
7            while b:
8                a, b = b, a % b
9            return abs(a)
10
11        for i in range(n):
12            a = {}
13
14            for j in range(i + 1, n):
15                x = points[j][0] - points[i][0]
16                y = points[j][1] - points[i][1]
17
18                c = g(x, y)
19                x //= c
20                y //= c
21
22                if x == 0:
23                    y = 1
24                elif y == 0:
25                    x = 1
26                elif x < 0:
27                    x = -x
28                    y = -y
29
30                a[(x, y)] = a.get((x, y), 0) + 1
31
32            if a:
33                ans = max(ans, max(a.values()) + 1)
34            else:
35                ans = max(ans, 1)
36
37        return ans