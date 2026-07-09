// Last updated: 7/9/2026, 3:06:34 PM
class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder b = new StringBuilder(s);

        while (true) {
            boolean f = false;

            for (int i = 0; i < b.length(); i++) {
                for (int j = i + 1; j < b.length(); j++) {
                    if (b.charAt(i) == b.charAt(j) && j - i <= k) {
                        b.deleteCharAt(j);
                        f = true;
                        break;
                    }
                }
                if (f) break;
            }

            if (!f) break;
        }

        return b.toString();
    }
}