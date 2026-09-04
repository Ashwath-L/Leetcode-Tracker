// Last updated: 9/4/2026, 4:25:39 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] suffix = new int[n];
5 
6        int mn = Integer.MAX_VALUE;
7        for (int i = n - 1; i >= 0; i--) {
8            mn = Math.min(mn, nums[i]);
9            suffix[i] = mn;
10        }
11 
12        int mx = 0;
13        for (int i = 0; i < n; i++) {
14            mx = Math.max(mx, nums[i]);
15            int score = mx - suffix[i];
16            if (score <= k)
17                return i;
18        }
19 
20        return -1;
21    }
22}