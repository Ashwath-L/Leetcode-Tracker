// Last updated: 7/9/2026, 3:10:48 PM
class Solution {
    public int trap(int[] height) {
        int b = 0;
        int c = height.length - 1;
        int d = 0;
        int e = 0;
        int f = 0;

        while (b <= c) {
            if (height[b] <= height[c]) {
                if (height[b] >= d) {
                    d = height[b];
                } else {
                    f += d - height[b];
                }
                b++;
            } else {
                if (height[c] >= e) {
                    e = height[c];
                } else {
                    f += e - height[c];
                }
                c--;
            }
        }
        return f;
    }
}