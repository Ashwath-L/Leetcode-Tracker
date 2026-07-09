// Last updated: 7/9/2026, 3:05:58 PM
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < suffixMin[i + 1]) {
                suffixMin[i] = nums[i];
            } else {
                suffixMin[i] = suffixMin[i + 1];
            }
        }
        long prefixSum = 0;                 
        long maxScore = Long.MIN_VALUE;     
        for (int i = 0; i < n - 1; i++) {
            prefixSum = prefixSum + nums[i];
            long score = prefixSum - suffixMin[i + 1];
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
}
