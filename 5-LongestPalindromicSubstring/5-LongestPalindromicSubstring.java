// Last updated: 7/9/2026, 3:11:23 PM
class Solution {
    public String longestPalindrome(String s) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = expand(s, i, i);
            int d = expand(s, i, i + 1);
            int e = Math.max(c, d);

            if (e > b - a + 1) {
                a = i - (e - 1) / 2;
                b = i + e / 2;
            }
        }

        return s.substring(a, b + 1);
    }

    public int expand(String s, int a, int b) {
        while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }
        return b - a - 1;
    }
}