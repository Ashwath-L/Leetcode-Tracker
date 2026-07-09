// Last updated: 7/9/2026, 3:07:39 PM
class Solution {

    int[][] dp;

    public int minInsertions(String s) {

        String a = new StringBuilder(s).reverse().toString();

        int n = s.length();

        dp = new int[n + 1][n + 1];

        for(int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int lps = helper(s, a, n, n);

        return n - lps;
    }

    int helper(String ch1, String ch2, int m, int n) {

        if(m == 0 || n == 0) {
            return 0;
        }

        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        if(ch1.charAt(m - 1) == ch2.charAt(n - 1)) {
            return dp[m][n] = 1 + helper(ch1, ch2, m - 1, n - 1);
        }

        return dp[m][n] = Math.max(
            helper(ch1, ch2, m - 1, n),
            helper(ch1, ch2, m, n - 1)
        );
    }
}