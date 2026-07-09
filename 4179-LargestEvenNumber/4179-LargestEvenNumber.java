// Last updated: 7/9/2026, 3:05:53 PM
class Solution {
    public String largestEven(String s) {
        int a = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                a = i;
                break;
            }
        }
        if (a == -1) {
            return "";
        }
        return s.substring(0, a + 1);
    }
}

