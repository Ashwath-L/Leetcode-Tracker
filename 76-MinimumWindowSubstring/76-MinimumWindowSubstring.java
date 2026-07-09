// Last updated: 7/9/2026, 3:10:22 PM
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] a = new int[128];

        for (char c : t.toCharArray()) a[c]++;

        int b = t.length();
        int c = 0;
        int d = 0;
        int e = Integer.MAX_VALUE;
        int f = 0;

        while (d < s.length()) {
            if (a[s.charAt(d)] > 0) b--;
            a[s.charAt(d)]--;
            d++;

            while (b == 0) {
                if (d - c < e) {
                    e = d - c;
                    f = c;
                }

                a[s.charAt(c)]++;
                if (a[s.charAt(c)] > 0) b++;
                c++;
            }
        }

        return e == Integer.MAX_VALUE ? "" : s.substring(f, f + e);
    }
}