// Last updated: 7/9/2026, 3:06:46 PM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(f(nums, k, true), f(nums, k, false));
    }

    long f(int[] a, int k, boolean m) {
        long INF = Long.MIN_VALUE / 4;

        long b = INF;
        long c = INF;
        long d = INF;
        long e = INF;

        for (int x : a) {
            long y;

            if (m) {
                y = (long) x * k;
            } else {
                if (x >= 0) {
                    y = x / k;
                } else {
                    y = -((-x) / k);
                }
            }

            long p = b;
            long q = c;
            long r = d;

            b = Math.max(p + x, (long) x);
            c = Math.max(Math.max(p + y, y), q + y);
            d = Math.max(q + x, r + x);

            e = Math.max(e, Math.max(b, Math.max(c, d)));
        }

        return e;
    }
}