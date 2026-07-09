// Last updated: 7/9/2026, 3:05:16 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int p = mul;
        for (int i = nums.length - 1, cnt = 0; cnt < k; i--, cnt++) {
            if (p > 1) {
                ans += (long) nums[i] * p;
                p--;
            } else {
                ans += nums[i];
            }
        }
        return ans;
    }
}