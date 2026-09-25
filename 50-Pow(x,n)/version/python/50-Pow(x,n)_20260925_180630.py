# Last updated: 9/25/2026, 6:06:30 PM
1class Solution:
2    def insert(self, intervals, newInterval):
3        ans = []
4
5        for a in intervals:
6            if a[1] < newInterval[0]:
7                ans.append(a)
8
9            elif a[0] > newInterval[1]:
10                ans.append(newInterval)
11                newInterval = a
12
13            else:
14                newInterval[0] = min(newInterval[0], a[0])
15                newInterval[1] = max(newInterval[1], a[1])
16
17        ans.append(newInterval)
18
19        return ans