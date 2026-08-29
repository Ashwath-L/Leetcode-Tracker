# Last updated: 8/29/2026, 8:22:21 PM
1class Solution:
2    def lexicographicallySmallestArray(self, a: List[int], k: int) -> List[int]:
3        b = []
4        n = len(a)
5        for i in range(n):
6            b.append((a[i],i))
7        b = sorted(b,key=lambda x: x[0])
8        
9        c = [[b[0]]]
10        for i in range(1,n):
11            if b[i][0]-b[i-1][0] <= k:
12                c[-1].append(b[i])
13            else:
14                c.append([b[i]])
15        for t in c:
16            ind = []
17            for x,y in t:
18                ind.append(y)
19            ind.sort()
20            for i in range(len(ind)):
21                a[ind[i]] = t[i][0]
22        return a