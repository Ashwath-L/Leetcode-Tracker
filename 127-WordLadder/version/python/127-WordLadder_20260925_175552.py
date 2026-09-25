# Last updated: 9/25/2026, 5:55:52 PM
1class Solution:
2    def maxProfit(self, k, prices):
3        n = len(prices)
4
5        if n == 0:
6            return 0
7
8        if k >= n // 2:
9            a = 0
10
11            for i in range(1, n):
12                if prices[i] > prices[i - 1]:
13                    a += prices[i] - prices[i - 1]
14
15            return a
16
17        a = [0] * (k + 1)
18        b = [float('-inf')] * (k + 1)
19
20        for x in prices:
21            for j in range(1, k + 1):
22                b[j] = max(b[j], a[j - 1] - x)
23                a[j] = max(a[j], b[j] + x)
24
25        return a[k]