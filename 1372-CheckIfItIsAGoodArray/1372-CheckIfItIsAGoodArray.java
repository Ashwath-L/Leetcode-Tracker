// Last updated: 7/9/2026, 3:07:41 PM
class Solution {
    public boolean isGoodArray(int[] nums) {
        int a = nums[0];

        for (int i = 1; i < nums.length; i++) {
            a = gcd(a, nums[i]);
        }

        return a == 1;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}