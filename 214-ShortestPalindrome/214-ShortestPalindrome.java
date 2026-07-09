// Last updated: 7/9/2026, 3:09:06 PM
class Solution {
    public String shortestPalindrome(String s) {
        String a = s;
        String b = new StringBuilder(s).reverse().toString();
        String c = a + "#" + b;

        int[] d = new int[c.length()];

        for (int i = 1; i < c.length(); i++) {
            int e = d[i - 1];

            while (e > 0 && c.charAt(i) != c.charAt(e)) {
                e = d[e - 1];
            }

            if (c.charAt(i) == c.charAt(e)) {
                e++;
            }

            d[i] = e;
        }

        int f = d[c.length() - 1];

        return new StringBuilder(s.substring(f)).reverse().toString() + s;
    }
}