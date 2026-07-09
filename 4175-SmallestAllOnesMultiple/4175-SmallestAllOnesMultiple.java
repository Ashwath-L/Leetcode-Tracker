// Last updated: 7/9/2026, 3:05:57 PM
class Solution {
    public int minAllOneMultiple(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int a = 0;
        for (int b = 1; b <= k; b++) {
            a = (a * 10 + 1) % k;
            if (a == 0) {
                return b;
            }
        }
        return -1;
    }
}

