// Last updated: 7/9/2026, 3:08:50 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long s = mid * mid;
            if (s == num) {
                return true;
            } else if (s < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false; 
    }
}