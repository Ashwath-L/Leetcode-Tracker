// Last updated: 7/9/2026, 3:09:08 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int arr1[] = new int[n - 1];
        int arr2[] = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = nums[i];
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int n1 = arr1.length - 1;
        int ans1 = helper(arr1, n1, dp);

        Arrays.fill(dp, -1);

        int n2 = arr2.length - 1;
        int ans2 = helper(arr2, n2, dp);

        return Math.max(ans1, ans2);
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