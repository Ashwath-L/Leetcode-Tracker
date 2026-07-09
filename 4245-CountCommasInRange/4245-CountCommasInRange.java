// Last updated: 7/9/2026, 3:05:35 PM
class Solution {
    public int countCommas(int n) {
        if(n < 1000) return 0;
        return n - 999;
    }
}