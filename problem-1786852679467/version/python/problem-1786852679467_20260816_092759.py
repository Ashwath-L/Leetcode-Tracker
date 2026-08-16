# Last updated: 8/16/2026, 9:27:59 AM
1class Solution(object):
2    def minPenalty(self, period, lights, arrivalTime):
3        a = max(lights)
4        b = 0
5        for c in arrivalTime:
6            d = c % period
7            if d < a:
8                continue
9            e = period - d
10            if e > b:
11                b = e
12        return b