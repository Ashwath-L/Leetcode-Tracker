# Last updated: 7/12/2026, 9:03:32 AM
1class Solution(object):
2    def minimumCost(self, nums, k):
3        q = 10**9 + 7
4        a = k
5        b = 0
6        c = 0
7        for d in nums:
8            if a < d:
9                e = (d - a + k - 1) // k
10                c += e * (2 * b + e + 1) // 2
11                b += e
12                a += e * k
13            a -= d
14
15        return c % q