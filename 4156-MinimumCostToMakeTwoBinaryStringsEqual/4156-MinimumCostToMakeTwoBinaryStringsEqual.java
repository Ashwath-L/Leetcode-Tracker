// Last updated: 7/9/2026, 3:06:05 PM
class Solution {
    public long minimumCost(String s, String t, int flipCost, int swapCost, int crossCost) {
        int a = 0, b = 0; // a = 01, b = 10
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) == '0') a++;
                else b++;
            }
        }
        int mismatches = a + b;
        long costFlipAll = (long) mismatches * flipCost;
        long cost = 0;
        int pairs = Math.min(a, b);
        cost += (long) pairs * swapCost;
        int remaining = Math.abs(a - b);
        long twoCost = Math.min(2L * flipCost, (long) crossCost + swapCost);
        cost += (long) (remaining / 2) * twoCost;
        if (remaining % 2 == 1) {
            cost += flipCost;
        }
        return Math.min(cost, costFlipAll);
    }
}
