// Last updated: 7/9/2026, 3:08:49 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray())
            c ^= cs;
        for (char ct : t.toCharArray())
            c ^= ct;
        return c;
    }
}