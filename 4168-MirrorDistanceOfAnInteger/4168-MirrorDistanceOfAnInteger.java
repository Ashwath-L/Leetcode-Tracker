// Last updated: 7/9/2026, 3:06:00 PM
class Solution {
    public int mirrorDistance(int n) {
    int a = n;
        int b = 0;
        while (n > 0) {
            b = b * 10 + (n % 10);
            n = n / 10;
        }
        return Math.abs(a - b);
    }
}

