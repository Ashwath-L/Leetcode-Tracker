# Last updated: 9/27/2026, 3:42:47 PM
1class Solution:
2    def addOperators(self, num, target):
3        ans = []
4
5        def f(i, a, b, c):
6            if i == len(num):
7                if b == target:
8                    ans.append(a)
9                return
10
11            for j in range(i, len(num)):
12                if j > i and num[i] == "0":
13                    break
14
15                d = num[i:j + 1]
16                e = int(d)
17
18                if i == 0:
19                    f(j + 1, d, e, e)
20                else:
21                    f(j + 1, a + "+" + d, b + e, e)
22                    f(j + 1, a + "-" + d, b - e, -e)
23                    f(j + 1, a + "*" + d, b - c + c * e, c * e)
24
25        f(0, "", 0, 0)
26
27        return ans