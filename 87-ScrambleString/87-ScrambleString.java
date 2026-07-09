// Last updated: 7/9/2026, 3:10:12 PM
class Solution {
    HashMap<String, Boolean> a = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;

        String b = s1 + "#" + s2;
        if (a.containsKey(b)) return a.get(b);

        if (s1.length() != s2.length()) return false;

        int[] c = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            c[s1.charAt(i) - 'a']++;
            c[s2.charAt(i) - 'a']--;
        }

        for (int i : c) {
            if (i != 0) {
                a.put(b, false);
                return false;
            }
        }

        int d = s1.length();

        for (int i = 1; i < d; i++) {
            if ((isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                 isScramble(s1.substring(i), s2.substring(i))) ||
                (isScramble(s1.substring(0, i), s2.substring(d - i)) &&
                 isScramble(s1.substring(i), s2.substring(0, d - i)))) {
                a.put(b, true);
                return true;
            }
        }

        a.put(b, false);
        return false;
    }
}