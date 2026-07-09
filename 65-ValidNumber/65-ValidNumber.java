// Last updated: 7/9/2026, 3:10:34 PM
class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        boolean a = false;
        boolean b = false;
        boolean c = false;

        for (int i = 0; i < s.length(); i++) {
            char d = s.charAt(i);

            if (Character.isDigit(d)) {
                a = true;
            } else if (d == '+' || d == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            } else if (d == '.') {
                if (b || c)
                    return false;
                b = true;
            } else if (d == 'e' || d == 'E') {
                if (c || !a)
                    return false;
                c = true;
                a = false;
            } else {
                return false;
            }
        }

        return a;
    }
}