// Last updated: 7/9/2026, 3:08:27 PM
class Solution {

    int[][] dp;

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        dp = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int lcs = helper(word1, word2, m, n);

        return m + n - 2 * lcs;
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