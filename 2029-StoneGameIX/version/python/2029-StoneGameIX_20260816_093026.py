# Last updated: 8/16/2026, 9:30:26 AM
1class Solution(object):
2    def stoneGameIX(self, stones):
3        a = [0, 0, 0]
4        for b in stones:
5            a[b % 3] += 1
6
7        if a[0] % 2 == 0:
8            return a[1] > 0 and a[2] > 0
9        else:
10            return abs(a[1] - a[2]) > 2