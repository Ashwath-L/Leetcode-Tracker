// Last updated: 7/9/2026, 3:05:47 PM
class Solution {
    public int scoreDifference(int[] nums) {

        int a = 0;
        int b = 0;
        boolean c = true;

        for (int i = 0; i < nums.length; i++) {

            int g = i + 1;

            if (nums[i] % 2 == 1) {
                c = !c;
            }

            if (g % 6 == 0) {
                c = !c;
            }

            if (c) {
                a += nums[i];
            } else {
                b += nums[i];
            }
        }

        return a - b;
    }
}