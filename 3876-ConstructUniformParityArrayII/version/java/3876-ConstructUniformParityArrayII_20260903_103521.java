// Last updated: 9/3/2026, 10:35:21 AM
1class Solution {
2    public boolean uniformArray(int[] A) {
3        int min = A[0], odd = 0;
4
5        for (int x : A) {
6            min = Math.min(min, x);
7            odd |= x & 1;
8        }
9
10        return (min & 1) == odd;
11    }
12}