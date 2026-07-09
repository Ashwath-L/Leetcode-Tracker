// Last updated: 7/9/2026, 3:08:40 PM
class Solution {

    Boolean[][] dp;

    public boolean canPartition(int[] nums) {

        int totalSum = 0;

        for(int num : nums) {
            totalSum += num;
        }

        if(totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        dp = new Boolean[nums.length + 1][target + 1];

        return subset(nums, nums.length, target);
    }

    public boolean subset(int[] nums, int n, int sum) {

        if(sum == 0) {
            return true;
        }

        if(n == 0) {
            return false;
        }

        if(dp[n][sum] != null) {
            return dp[n][sum];
        }

        boolean take = false;

        if(nums[n - 1] <= sum) {
            take = subset(nums, n - 1, sum - nums[n - 1]);
        }

        boolean notTake = subset(nums, n - 1, sum);

        return dp[n][sum] = take || notTake;
    }
}