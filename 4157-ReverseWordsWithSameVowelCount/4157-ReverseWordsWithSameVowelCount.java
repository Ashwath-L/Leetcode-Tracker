// Last updated: 7/9/2026, 3:06:03 PM
class Solution {
    public String reverseWords(String s) {

        String[] p = s.split(" ");
        int x = 0;

        for (int i = 0; i < p[0].length(); i++) {
            char k = p[0].charAt(i);
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
                x++;
            }
        }

        for (int i = 1; i < p.length; i++) {
            int q = 0;

            for (int j = 0; j < p[i].length(); j++) {
                char r = p[i].charAt(j);
                if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
                    q++;
                }
            }

            if (q == x) {
                String z = "";
                for (int j = p[i].length() - 1; j >= 0; j--) {
                    z += p[i].charAt(j);
                }
                p[i] = z;
            }
        }

        String m = "";
        for (int i = 0; i < p.length; i++) {
            if (i > 0) m += " ";
            m += p[i];
        }

        return m;
    }
}