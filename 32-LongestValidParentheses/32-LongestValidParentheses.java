// Last updated: 7/9/2026, 3:10:55 PM
class Solution {
    public int longestValidParentheses(String s) {
        int[] a = new int[s.length() + 1];
        int b = -1;
        int c = 0;

        a[++b] = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a[++b] = i;
            } else {
                b--;
                if (b < 0) {
                    a[++b] = i;
                } else {
                    c = Math.max(c, i - a[b]);
                }
            }
        }

        return c;
    }
}