// Last updated: 7/9/2026, 3:05:40 PM
class Solution {
    public int longestArithmetic(int[] nums) {

        int n = nums.length;

        if (n <= 2) return n;

        int[] L = new int[n];
        int[] R = new int[n];

        L[0] = 1;
        L[1] = 2;

        for (int i = 2; i < n; i++) {
            long d1 = (long) nums[i] - nums[i - 1];
            long d2 = (long) nums[i - 1] - nums[i - 2];

            if (d1 == d2)
                L[i] = L[i - 1] + 1;
            else
                L[i] = 2;
        }

        R[n - 1] = 1;
        R[n - 2] = 2;

        for (int i = n - 3; i >= 0; i--) {
            long d1 = (long) nums[i + 1] - nums[i];
            long d2 = (long) nums[i + 2] - nums[i + 1];

            if (d1 == d2)
                R[i] = R[i + 1] + 1;
            else
                R[i] = 2;
        }

        int ans = 2;

        for (int i = 0; i < n; i++) {

            if (i > 0)
                ans = Math.max(ans, L[i - 1] + 1);

            if (i + 1 < n)
                ans = Math.max(ans, R[i + 1] + 1);

            if (i > 0 && i + 1 < n) {

                long gap = (long) nums[i + 1] - nums[i - 1];

                if (gap % 2 == 0) {

                    long d = gap / 2;

                    int leftLen = 1;
                    if (i >= 2 && nums[i - 1] - nums[i - 2] == d)
                        leftLen = L[i - 1];

                    int rightLen = 1;
                    if (i + 2 < n && nums[i + 2] - nums[i + 1] == d)
                        rightLen = R[i + 1];

                    ans = Math.max(ans, leftLen + 1 + rightLen);
                }
            }
        }

        return Math.min(ans, n);
    }
}