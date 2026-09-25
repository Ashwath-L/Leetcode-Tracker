# Last updated: 9/25/2026, 6:04:39 PM
1class Solution:
2    def groupAnagrams(self, strs):
3        a = {}
4
5        for i in strs:
6            b = "".join(sorted(i))
7
8            if b not in a:
9                a[b] = []
10
11            a[b].append(i)
12
13        return list(a.values())