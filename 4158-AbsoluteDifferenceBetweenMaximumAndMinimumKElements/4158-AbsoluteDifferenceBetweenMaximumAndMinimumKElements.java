// Last updated: 7/9/2026, 3:06:02 PM
class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int a = 0, b = 0;
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            a += nums[i];
            b += nums[n - 1 - i];
        }

        if (a > b) return a - b;
        return b - a;
    }
}