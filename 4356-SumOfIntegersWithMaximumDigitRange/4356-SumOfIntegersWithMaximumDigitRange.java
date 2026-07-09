// Last updated: 7/9/2026, 3:05:18 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int a = -1;
        int b = 0;

        for (int c : nums) {
            int d = c;
            int e = 9;
            int f = 0;

            while (d > 0) {
                int g = d % 10;
                if (g < e) e = g;
                if (g > f) f = g;
                d /= 10;
            }

            int h = f - e;

            if (h > a) {
                a = h;
                b = c;
            } else if (h == a) {
                b += c;
            }
        }

        return b;
    }
}