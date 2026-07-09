// Last updated: 7/9/2026, 3:10:46 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int a = 0, b = 0, c = -1, d = -1;

        while (a < s.length()) {
            if (b < p.length() && (p.charAt(b) == '?' || p.charAt(b) == s.charAt(a))) {
                a++;
                b++;
            } else if (b < p.length() && p.charAt(b) == '*') {
                c = b;
                d = a;
                b++;
            } else if (c != -1) {
                b = c + 1;
                d++;
                a = d;
            } else {
                return false;
            }
        }

        while (b < p.length() && p.charAt(b) == '*') {
            b++;
        }

        return b == p.length();
    }
}