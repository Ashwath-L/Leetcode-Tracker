# Last updated: 9/23/2026, 9:03:52 AM
1class Solution:
2    def minOperations(self, A: List[int], x: int) -> int:
3        k = sum(A) - x
4        if k < 0: return -1 
5        best = -1
6        
7        s = i = 0
8        
9        for j, num in enumerate(A):
10            s += num
11            while s > k:
12                s -= A[i]
13                i += 1  
14            if s == k:
15                best = max(best, j - i + 1)
16
17        return -1 if best < 0 else len(A) - best
18