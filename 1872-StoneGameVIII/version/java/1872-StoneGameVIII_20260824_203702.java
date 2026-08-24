// Last updated: 8/24/2026, 8:37:02 PM
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n = stones.length;
4        int[] prefix = stones.clone();
5        for (int i = 1; i < n; i++) {
6            prefix[i] += prefix[i - 1];
7        }
8        int best = prefix[n - 1];
9        for (int i = n - 2; i >= 1; i--) {
10            best = Math.max(best, prefix[i] - best);
11        }
12        return best;
13    }
14}