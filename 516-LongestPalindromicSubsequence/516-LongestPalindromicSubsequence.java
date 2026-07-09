// Last updated: 7/9/2026, 3:08:33 PM
class Solution {
    int[][] dp;

    public int longestPalindromeSubseq(String s) {

        String t = new StringBuilder(s).reverse().toString();

        int m = s.length();
        int n = t.length();

        dp = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(s, t, m, n);
    }

    int helper(String s, String t, int m, int n) {

        if(m == 0 || n == 0) {
            return 0;
        }

        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        if(s.charAt(m - 1) == t.charAt(n - 1)) {
            return dp[m][n] = 1 + helper(s, t, m - 1, n - 1);
        }

        return dp[m][n] = Math.max(
            helper(s, t, m - 1, n),
            helper(s, t, m, n - 1)
        );
    }
}