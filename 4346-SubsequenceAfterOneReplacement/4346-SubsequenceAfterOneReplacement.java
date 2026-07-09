// Last updated: 7/9/2026, 3:05:20 PM
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int a = s.length();
        int b = 0;
        int c = 0;

        for (int d = 0; d < t.length(); d++) {
            char e = t.charAt(d);

            if (c < a && s.charAt(c) == e) {
                c++;
            }

            if (b < a) {
                c = Math.max(c, b + 1);
            }

            if (b < a && s.charAt(b) == e) {
                b++;
            }
        }

        return b == a || c == a;
    }
}