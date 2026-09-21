// Last updated: 9/21/2026, 9:07:23 PM
1class Solution {
2    public boolean checkOverlap(int r, int cx, int cy, int x1, int y1, int x2, int y2) {
3        int x = Math.max(x1, Math.min(cx, x2)) - cx;
4        int y = Math.max(y1, Math.min(cy, y2)) - cy;
5
6        return x * x + y * y <= r * r;
7    }
8}