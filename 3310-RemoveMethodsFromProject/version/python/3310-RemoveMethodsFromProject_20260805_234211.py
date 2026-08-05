# Last updated: 8/5/2026, 11:42:11 PM
1class Solution:
2    def remainingMethods(self, n: int, k: int, invocations: List[List[int]]) -> List[int]:
3        adj = {i: [] for i in range(n)}
4
5        for src, dst in invocations:
6            adj[src].append(dst)
7
8        q = [k]
9        visited = set([k])
10
11        while q:
12            suspicious = q.pop()
13
14            for nei in adj[suspicious]:
15                if nei not in visited:
16                    visited.add(nei)
17                    q.append(nei)
18
19        res = []
20
21        for method in range(n):
22            if method in visited:
23                continue
24
25            for nei in adj[method]:
26                if nei in visited:
27                    return list(range(n))
28
29            res.append(method)
30
31        return res