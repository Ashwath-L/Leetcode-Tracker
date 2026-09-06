// Last updated: 9/6/2026, 11:49:20 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int m = s.length(), n = t.length();
4        if (m < n) {
5            return 0;
6        }
7        int[] dp = new int[n + 1];
8        dp[n] = 1;
9        
10        for (int i = m - 1; i >= 0; i--) {
11            char sChar = s.charAt(i);
12            for (int j = 0; j < n; j++) {
13                char tChar = t.charAt(j);
14                if (sChar == tChar) {
15                    dp[j] = dp[j + 1] + dp[j];
16                }
17            }
18        }
19        
20        return dp[0];
21    }
22}