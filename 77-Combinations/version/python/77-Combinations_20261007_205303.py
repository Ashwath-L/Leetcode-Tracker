# Last updated: 10/7/2026, 8:53:03 PM
1class Solution:
2    def combine(self, n: int, k: int) -> list[list[int]]:
3        result = []
4
5        def solve(i=1, lst=[], k=k):
6            if k == 0:
7                result.append(lst[:])
8                return
9
10            if i > n:
11                return
12
13            # Pick
14            lst.append(i)
15            solve(i + 1, lst, k - 1)
16
17            # Backtrack
18            lst.pop()
19
20            # Not pick
21            solve(i + 1, lst, k)
22
23        solve()
24        return result