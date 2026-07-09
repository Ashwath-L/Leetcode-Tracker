// Last updated: 7/9/2026, 3:09:17 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums, n - 1, dp);
    }
    int helper(int[] nums, int i, int[] dp) {
        if (i < 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int taken = nums[i] + helper(nums, i - 2, dp);
        int not = helper(nums, i - 1, dp);
        dp[i] = Math.max(taken, not);
        return dp[i];
    }
}