// Last updated: 7/23/2026, 7:02:05 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        if (n <= 2) return n;
5        int mask = 0;
6        for (int num : nums) {
7            mask |= num;
8        }
9        return mask + 1;
10    }
11}