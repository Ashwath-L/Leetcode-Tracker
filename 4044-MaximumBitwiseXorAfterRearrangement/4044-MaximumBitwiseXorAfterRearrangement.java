// Last updated: 7/9/2026, 3:06:29 PM
class Solution {
    public String maximumXor(String s, String t) {
        int a = s.length();
        int b = 0;

        for (int i = 0; i < a; i++) {
            if (t.charAt(i) == '1') b++;
        }

        StringBuilder c = new StringBuilder();

        for (int i = 0; i < a; i++) {
            if (s.charAt(i) == '0') {
                if (b > 0) {
                    c.append('1');
                    b--;
                } else {
                    c.append('0');
                }
            } else {
                if (b < a - i) {
                    c.append('1');
                } else {
                    c.append('0');
                    b--;
                }
            }
        }

        return c.toString();
    }
}