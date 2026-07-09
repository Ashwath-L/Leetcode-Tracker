// Last updated: 7/9/2026, 3:06:17 PM
class Solution {
    public long minCost(String s, int[] cost) {
        String a = s;
        long t = 0;
        for (int i = 0; i < cost.length; i++) {
            t = t + cost[i];
        }
        long b = t;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            long c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    c = c + cost[i];
                }
            }
            if (c > 0) {
                long d = t - c;
                if (d < b) {
                    b = d;
                }
            }
        }
        return b;
    }
}
