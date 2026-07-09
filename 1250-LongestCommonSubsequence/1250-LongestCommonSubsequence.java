// Last updated: 7/9/2026, 3:07:48 PM
class Solution {
    int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        dp = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(text1, text2, m, n);
    }

    int helper(String text1, String text2, int m, int n) {

        if(m == 0 || n == 0) {
            return 0;
        }

        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        if(text1.charAt(m - 1) == text2.charAt(n - 1)) {
            return dp[m][n] = 1 + helper(text1, text2, m - 1, n - 1);
        }

        return dp[m][n] = Math.max(
            helper(text1, text2, m - 1, n),
            helper(text1, text2, m, n - 1)
        );
    }
}