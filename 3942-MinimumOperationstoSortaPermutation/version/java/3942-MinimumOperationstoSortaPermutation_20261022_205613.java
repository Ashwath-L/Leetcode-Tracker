// Last updated: 10/22/2026, 8:56:13 PM
1class Solution {
2    public int minOperations(int[] A) {
3        int n = A.length;
4        int asc = 1, dsc = 1;
5
6        for (int i = 1; i < n; i++) {
7            if (A[i] == (A[i - 1] + 1) % n)
8                asc++;            
9            if (A[i - 1] == (A[i] + 1) % n)
10                dsc++;
11        }
12
13        if (asc == n)
14            return A[0] == 0 ? 0 : Math.min(n - A[0], A[0] + 2);
15
16        if (dsc == n)
17            return Math.min(n - A[n - 1], A[n - 1]) + 1;
18
19        return -1;
20    }
21}