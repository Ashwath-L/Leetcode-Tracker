// Last updated: 7/9/2026, 3:10:59 PM
class Solution {
    public int strStr(String a, String b) {
        int c = a.length();
        int d = b.length();
        for (int i = 0; i <= c - d; i++) {
            int e = 0;
            while (e < d && a.charAt(i + e) == b.charAt(e)) {
                e++;
            }
            if (e == d) {
                return i;
            }
        }
        return -1;
    }
}