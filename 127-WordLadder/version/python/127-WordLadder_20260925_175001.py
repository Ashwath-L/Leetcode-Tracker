# Last updated: 9/25/2026, 5:50:01 PM
1class Solution:
2    def candy(self, ratings):
3        n = len(ratings)
4        a = [1] * n
5
6        for i in range(1, n):
7            if ratings[i] > ratings[i - 1]:
8                a[i] = a[i - 1] + 1
9
10        for i in range(n - 2, -1, -1):
11            if ratings[i] > ratings[i + 1]:
12                a[i] = max(a[i], a[i + 1] + 1)
13
14        return sum(a)